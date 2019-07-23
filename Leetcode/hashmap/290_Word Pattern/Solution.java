class Solution {
    public boolean wordPattern(String pattern, String str) {
        char[] p = pattern.toCharArray();
        String[] words = str.split(" ");
        if(p.length != words.length) return false;
        HashMap< Character, String > map = new HashMap<>();
        for(int i = 0; i<p.length; i++){
            if(!map.containsKey(p[i]) ){
                if(map.containsValue(words[i]))
                    return false;
                map.put(p[i], words[i]);
                continue;
            }
            if( !map.get(p[i]).equals(words[i]))
                return false;
        }
        return true;
    }
}
        /*/ char c = pattern.charAt(i);
            String word = words[i];
            if(map.containsValue(word) && !map.containsKey(c)){
                return false;
            }
            map.putIfAbsent(c, word);
            if(map.containsKey(c) && !(map.get(c).equals(word))){
                return false;
            } /*/
