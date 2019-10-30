class Solution {
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return isPalindrome(s.substring(start, end))||isPalindrome(s.substring(start+1, end+1));
            start++; end--;
        }
        return true;
    }
    private boolean isPalindrome(String s){
        int start = 0, end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++; end--;
        }
        return (s.length()==0)? false: true;
    }
}
