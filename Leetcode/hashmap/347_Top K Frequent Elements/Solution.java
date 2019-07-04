class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        TreeMap<Integer, List<Integer>> freqMap = new TreeMap<>();
        List<Integer> res = new ArrayList<>();
        for(int num: nums){
             map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num: map.keySet()){
            int freq = map.get(num);
            if(!freqMap.containsKey(freq)){
                freqMap.put(freq, new ArrayList<Integer>());
            }
            freqMap.get(freq).add(num);
        }
        while(res.size()<k){
            Map.Entry<Integer, List<Integer>> entry = freqMap.pollLastEntry();
            res.addAll(entry.getValue());
        }
        return res;
    }
}
