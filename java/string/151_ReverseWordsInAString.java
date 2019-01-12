public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] res = s.split("\\s+");
        int len = res.length;
        for (int i = 0; i<res.length/2; i++){
            res[i]=res[i]+res[len-1-i];
            res[len-1-i]=res[i].substring(0, res[i].length()-res[len-1-i].length());
            res[i]=res[i].substring(res[len-1-i].length());
        }
        return String.join(" ",res);
    }
}
