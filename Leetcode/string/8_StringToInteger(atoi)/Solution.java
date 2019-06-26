class Solution {
    public int myAtoi(String str) {
        int i = 0, n = str.length(), sign = 1, res = 0;
        for(; i<n && str.charAt(i)==' '; i++);
        if(n == 0 || i>=n) return 0;
        if(str.charAt(i)=='+' || str.charAt(i)=='-'){
            sign *= (str.charAt(i)) == '+'? 1: -1;
            i++;
        }
        System.out.println(Integer.MAX_VALUE);
        while( i<n && str.charAt(i) >= '0' && str.charAt(i)<='9' ){
            if( res > Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && str.charAt(i)-'0'>7) ){
                return (sign==1)? Integer.MAX_VALUE: Integer.MIN_VALUE;
            }
            res = res*10 + (str.charAt(i)-'0');
            //System.out.println(res);
            i++;
        }
        return res*sign;
    }
}
