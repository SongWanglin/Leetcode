class Solution {
    /* brute force */
    /*/
    public int nthUglyNumber(int n) {
        int count = 0;
        while(n>0){
            count++;
            if(isUgly(count)){
                n--;
            }
        }
        return count;
    }
    private boolean isUgly(int num) {
        return (num==0)? false: (num==1)?true: (num%2==0)?isUgly(num/2):
                (num%3==0)?isUgly(num/3):  (num%5==0)?isUgly(num/5): false;
    }
    /*/
    public int nthUglyNumber(int n) {
        int[] DP = new int[n];
        DP[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0, min = 0;
        for (int i = 1; i<n; i++){
            min = Math.min(Math.min(DP[i2]*2, DP[i3]*3), DP[i5]*5);
            i2 += (min==DP[i2]*2)? 1: 0;
            i3 += (min==DP[i3]*3)? 1: 0;
            i5 += (min==DP[i5]*5)? 1: 0;
            DP[i] = min;
        }
        return DP[n-1];
    }
}
