class Solution {
    public int countSubstrings(String s) {
        int len = s.length(), res = 0;
        for(int i = 0; i<=len; i++){
            for(int j = 0; j<i; j++){
                if(isPalindromic(s.substring(j, i))){
                    res++;
                }
            }
        }
        return res;
    }
        private boolean isPalindromic(String input){
            int n = input.length();
            for(int i = 0, j = n-1; i<=j; i++, j--){
                if(input.charAt(i)!=input.charAt(j)){
                    return false;
                }
            }
            return true;
        }
}
