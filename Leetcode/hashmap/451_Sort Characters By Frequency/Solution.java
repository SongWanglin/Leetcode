class Solution {
    public String frequencySort(String s) {
        /*/
        HashMap<Character, Integer> map = new HashMap<>();
        Map<Integer, List<Character>> freqMap = new TreeMap<>();
        StringBuilder res = new StringBuilder();
        for(Character c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Character c: map.keySet()){
            int key = map.get(c);
            if(!freqMap.containsKey(key)){
                freqMap.put(key, new LinkedList<Character>());
            }
            freqMap.get(key).add(c);
        }
        for(int num: freqMap.keySet()){
            List<Character> temp = freqMap.get(num);
            for(Character c: temp){
                for(int i = 0; i<num; i++)
                    res.insert(0, c);
            }
        }
        return res.toString();
        /*/
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        List<Character> [] bucket = new List[s.length() + 1];
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
        }

        StringBuilder sb = new StringBuilder();
        for (int pos = bucket.length - 1; pos >= 0; pos--)
            if (bucket[pos] != null)
                for (char c : bucket[pos])
                    for (int i = 0; i < map.get(c); i++)
                        sb.append(c);

        return sb.toString();
    }
}
