class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int l1 = str1.length(), l2 = str2.length(), count = 0, len = gcd(l1, l2);
        for(int i = 0; i<len; i++){
            if( str1.charAt(i)!=str2.charAt(i)){
                return "";
            }
            count++;
        }
        for(int i = 0; i<l1; i++){
            if( str1.charAt(i)!=str2.charAt(i%count)){
                return "";
            }
        }
        for(int i = 0; i<l2; i++){
            if( str1.charAt(i%count)!=str2.charAt(i) ){
                return "";
            }
        }
        return str1.substring(0, count);
    }
        private int gcd(int a, int b){
            if(b==0 ){
                return a;
            }
            return gcd(b, a%b);
        }
}
/* using string API in java (startWith and substring), time complexity is worse ( O(n^2) ) */
/*/
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) { return gcdOfStrings(str2, str1); } // make sure str1 is not shorter than str2.
        else if (!str1.startsWith(str2)) { return ""; } // shorter string is not common prefix.
        else if (str2.isEmpty()) { return str1; } // gcd string found.
        else { return gcdOfStrings(str1.substring(str2.length()), str2); } // cut off the common prefix part of str1.
    }
/*/
