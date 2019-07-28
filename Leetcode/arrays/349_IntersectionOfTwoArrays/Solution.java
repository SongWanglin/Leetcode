class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>(), set2 = new HashSet<>();
        for(int num: nums1){
            set.add(num);
        }
        for(int num: nums2){
            if(set.contains(num)){
                set2.add(num);
            }
        }
        int[] res = new int[set2.size()];
        int i = 0;
        for(int num: set2){
            res[i++] = num;
        }
        return res;
    }
}
