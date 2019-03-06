class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<Integer>();
        for (int i = 0; i<nums.length; i++){
            if(!res.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
