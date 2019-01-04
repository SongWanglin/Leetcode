class Solution {
    public int reverse(int x) {
        long res = 0; int temp = Math.abs(x);
        while(temp > 0){
            res = res*10+ temp%10;
            temp = (temp-temp%10)/10;
        }
        if (res> Long.parseLong("2147483647"))
            return 0;
        if (x<=0)
            return -(int)res;
        return (int)res;
    }
}
