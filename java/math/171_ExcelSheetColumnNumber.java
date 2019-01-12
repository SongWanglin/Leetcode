class Solution {
    public int titleToNumber(String s) {
        int res = 0, digit = 1;
        for (int i = s.length(); i>0; i--){
            res += digit*((int)(s.charAt(i-1))-64);
            digit *=26;
        }
        return res;
    }
}
