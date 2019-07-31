class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        TreeMap<Integer, List<String>> freqMap = new TreeMap<>();
        for(int i = 0; i<list1.length; i++){
            map.put(list1[i], i);
        }
        for(int i = 0; i<list2.length; i++){
            if(!map.containsKey(list2[i])){
                continue;
            }
            int freq = map.get(list2[i])+i;
            if(!freqMap.containsKey(freq)){
                freqMap.put(freq, new LinkedList<String>());
            }
            freqMap.get(freq).add(list2[i]);
        }
        Map.Entry<Integer, List<String>> e = freqMap.pollFirstEntry();
        List<String> list = e.getValue();
        String[] res = new String[list.size()];
        list.toArray(res);
        return res;
    }
}
