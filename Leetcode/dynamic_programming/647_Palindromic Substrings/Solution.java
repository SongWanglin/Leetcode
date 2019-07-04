class Solution {
    public int countSubstrings(String s) {
        int n = s.length(), res = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                //System.out.println(s.substring(i, j));
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i < 2 || dp[i + 1][j - 1]);
                if(dp[i][j]) res++;
            }
        }
        return res;
        /*/
        int len = s.length(), res = 0;
        for(int i = 0; i<=len; i++){
            for(int j = 0; j<i; j++){
                if(isPalindromic(s.substring(j, i))){
                    res++;
                }
            }
        }
        return res;/*/
    }
    /*/  private boolean isPalindromic(String input){
            int n = input.length();
            for(int i = 0, j = n-1; i<=j; i++, j--){
                if(input.charAt(i)!=input.charAt(j)){
                    return false;
                }
            }
            return true;
        }/*/
}

