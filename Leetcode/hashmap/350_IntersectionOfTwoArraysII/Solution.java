class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for(int num: nums1){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num: nums2){
            map2.put(num, map2.getOrDefault(num, 0)+1);
        }
        List<Integer> res = new LinkedList<>();
        for(int num: map.keySet()){
            if(!map2.containsKey(num))
                continue;
            for(int i = 0; i<Math.min(map.get(num), map2.get(num)); ++i)
                res.add(num);
        }
        return res.stream().mapToInt(e->(int) e).toArray();
    }
}
