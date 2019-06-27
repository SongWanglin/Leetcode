public class Solution {
    public String reverseStr(String s, int k) {
        if(k <= 0) return "";
        char [] res = s.toCharArray();
        int length = s.length();
        for(int i = 0; i < length; i += (2 * k)) {
            int head = i, end = i + k - 1;
            if(i + k >= length)
                end = length - 1;
            while(head < end) {
                char temp = res[head];
                res[head++] = res[end];
                res[end--] = temp;
            }
        }
        return new String(res);
    }
}
/*/ //1st solution, 28ms, too slow
  class Solution {
    public String reverseStr(String s, int k) {
        String[] s1 = s.split("(?<=\\G.{"+k+"})");
        for (int i=0; 2*i*k<s.length(); i++){
            s1[2*i] = reverse(s1[2*i]);
            System.out.println(s1[2*i]);
        }
        return String.join("", s1);
    }
    public String reverse(String s){
        StringBuilder str = new StringBuilder(s);
        return str.reverse().toString();
    }
} /*/
