class Solution {
    public boolean isHappy(int n) {
        while (n>=10){
            n = digitSquareSum(n);
        }
        return n==1 || n==7;
    }
        private int digitSquareSum(int n){
            int res = 0;
            while(n>0){
                res += Math.pow(n%10, 2);
                n = (n-n%10)/10;
            }
            return res;
        }
}
