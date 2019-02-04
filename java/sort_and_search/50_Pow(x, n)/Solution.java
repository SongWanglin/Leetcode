class Solution {
    public double myPow(double x, int n) {
        if(n==Integer.MIN_VALUE){
            x = 1/x;
            n = -(n+1);
            return x*x*myPow(x*x, n/2-1);
        }
        if (n<0){
            x = 1/x; n = -n;
        }
        return (n==0)? 1:(n%2==0)?myPow(x*x, n/2): x*myPow(x*x, n/2);
    }
}
