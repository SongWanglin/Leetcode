// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public String solution(String S, int K) {
        // write your code in Java SE 8
        if(S.isEmpty())
            return S;
        String raw_input = S.replace("-","");
        StringBuilder res = new StringBuilder();
        char[] chars = raw_input.toCharArray();
        int len = chars.length;
        for(int i = 0; i<len; i++){
            char tmp = chars[len-1-i];
            res.insert(0, Character.toUpperCase(tmp) );
            if( (i+1)%K ==0 && i!=len-1){
                res.insert(0, "-");
            }
        }
        return res.toString();
    }
}
