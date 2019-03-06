class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int n = A.length, n1 = 0, n2 = 1;
        int res[] = new int[n];
        for (int i = 0; i<n; i++){
            if (A[i]%2 == 0){
                res[n1] = A[i]; n1 +=2;
            } else{
                res[n2] = A[i]; n2 +=2;
            }
        }
        return res;
    }
}