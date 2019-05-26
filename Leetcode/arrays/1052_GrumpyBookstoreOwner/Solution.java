class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int n = customers.length, max = Integer.MIN_VALUE, j = 0, sum = 0;
        for(int i=0; i<n; i++){
            if(grumpy[i]==0){
                sum += customers[i];
            }
        }
        for(int i = 0; i+X <= n; i++){
            while(j<n && j-i<X){
                if(grumpy[j] == 1){
                    sum += customers[j];
                }
                j++;
            }
            max = Math.max(max, sum);
            if(grumpy[i] == 1){
                sum -= customers[i];
            }
        }
        return max;
    }
}
