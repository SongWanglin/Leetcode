class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for(Character c: chars.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int res = 0;
        for(String word: words){
            res += word.length();
            Map<Character, Integer> map2 = new HashMap<>();
            boolean has = true;
            for(Character c: word.toCharArray()){
                if(!map.containsKey(c)){
                    res -= word.length();
                    has = false;
                    break;
                }
                map2.put(c, map2.getOrDefault(c, 0)+1);
            }
            if(has){
                for(Character c: map2.keySet()){
                    if(map.get(c) < map2.get(c)){
                        res -= word.length();
                        break;
                    }
                }
            }
        }
        return res;
    }
}
