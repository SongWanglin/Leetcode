class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0)
            return 0;
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0, j = -1; i<chars.length; i++){
            if(map.containsKey(chars[i])){
                j = Math.max(j, map.get(chars[i]));
            }
            map.put(chars[i], i);
            max = Math.max(max, i-j);
        }
        return  max;
    }
}
