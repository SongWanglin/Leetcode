class Solution {
    public String reverseWords(String s) {
        String[] res = s.split(" ");
        for (int i = 0; i<res.length; i++){
            res[i] = reverseString(res[i]);
        }
        return String.join(" ",res);
    }

    String reverseString(String s){
        String res = "";
        for (int i = s.length(); i>0; i--){
            res += s.charAt(i-1);
        }
        return res;
    }
}
