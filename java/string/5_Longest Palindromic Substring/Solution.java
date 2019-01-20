class Solution {
    int low =0 , high = 0;
    public String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2)
            return s;
        for( int i = 0; i<length-1; i++){
            validPalindrome(s, i, i);
            validPalindrome(s, i, i+1);
        }
        return s.substring(low, high);
    }
        private void validPalindrome(String s, int start, int end){
            while( start>=0 && end<s.length() && s.charAt(start) == s.charAt(end)){
                start--; end++;
            }
            if ( high-low < end - start -1){
                low = start + 1;
                high = end;
            }
        }
}
