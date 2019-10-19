class Solution {
    public double myPow(double x, int n) {
        if(n==Integer.MIN_VALUE)
            return (1/x)*myPow(1/x, Math.abs(n+1));
        if(n<0)
            return myPow(1/x, Math.abs(n));
        return (n==0)?1:(n==1)?x: myPow(x*x, n/2)*myPow(x, n%2);
    }
}
