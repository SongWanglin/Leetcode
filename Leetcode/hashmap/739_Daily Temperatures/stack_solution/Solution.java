class Solution {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        /*/ brute force
        int[] res = new int[n];
        for(int i = T.length-1; i>=0; i--){
            for(int j = i+1; j < T.length; j++){
                if(T[j] > T[i]){
                    res[i] = j - i;
                    break;
                }
            }
        }
        return res; /*/
        ///*/ stack solution
        int[] stack = new int[n];
        int top = -1;
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            while(top > -1 && T[i] > T[stack[top]]) {
                int idx = stack[top];
                res[idx] = i - idx;
                top--;
            }
            top++;
            stack[top] = i;
        }
        return res;
    }
}
