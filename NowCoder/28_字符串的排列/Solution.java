import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Collections;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        char[] chars = str.toCharArray();
        ArrayList<String> res = new ArrayList<>();
        if(chars==null || chars.length==0)
           return res;
        //TreeSet<String> temp = new TreeSet<>();
        dfs(res, chars, 0);
        //res.addAll(temp);
        Collections.sort(res);
        return res;
    }
        private void dfs(ArrayList<String>res, char[] chars, int index){
            if(index == chars.length-1){
                res.add(new String(chars));
                return;
            }
            HashSet<Character> used = new HashSet<>();
            for(int i = index; i<chars.length; i++){
                if(used.add(chars[i])){
                    Swap(chars, i, index);
                    dfs(res, chars, index+1);
                    Swap(chars, i, index);
                }
            }
        }

        private void Swap(char[] chars, int i, int j){
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }
}
