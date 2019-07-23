class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /*/ // brute force
        for(int i = 0; i<nums.length; i++){
            for(int j = 1; j<=k && i+j<nums.length; j++){
                if(nums[i]==nums[i+j])
                    return true;
            }
        }
        return false;
        /*/
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
