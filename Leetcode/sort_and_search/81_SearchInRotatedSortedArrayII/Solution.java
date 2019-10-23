class Solution {
    public boolean search(int[] nums, int target) {
        return search(nums, 0, nums.length-1, target);
    }
    private boolean search(int[] nums, int start, int end, int target){
        if(start>end)
            return false;
        int mid = start + (end-start)/2;
        if(nums[mid]==target)
            return true;
        if(nums[mid]==nums[end])
            return search(nums, start, end-1, target);
        if(nums[start]<=nums[mid]){
            if(nums[start]<=target && target<=nums[mid]){
                return search(nums, start, mid, target);
            }else{
                return search(nums, mid+1, end, target);
            }
        }
        if(nums[mid]<=nums[end]){
            if(nums[mid]<=target && target<=nums[end]){
                return search(nums, mid+1, end, target);
            }else{
                return search(nums, start, mid, target);
            }
        }
        return false;
    }
}
