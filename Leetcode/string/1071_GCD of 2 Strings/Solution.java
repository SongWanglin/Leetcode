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
