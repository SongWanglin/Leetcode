import java.util.HashMap;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chs = str.toCharArray();
        for(int i = 0; i<chs.length; i++){
            if(!map.containsKey(chs[i])){
                map.put(chs[i], 1);
                continue;
            }
            int tmp = map.get(chs[i]);
            map.put(chs[i], tmp+1);
        }
        int res = -1;
        for(int i = 0; i<chs.length; i++){
            if(map.get(chs[i])==1){
                res = i;
                break;
            }
        }
        return res;
    }
}
