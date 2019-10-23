class Solution {
    public int findMin(int[] nums) {
        return search(nums, 0, nums.length-1);
    }
    private int search(int[] nums, int start, int end){
        if(end-start==0)
            return nums[start];
        if(end-start==1)
            return Math.min(nums[start], nums[end]);
        int mid = start + (end - start)/2;
        if(mid-1>=start && nums[mid]<nums[mid-1])
            return nums[mid];
        if(nums[mid]==nums[end])
            return search(nums, start, end-1);
        if(nums[start]<=nums[mid]){
            if(nums[start]<=nums[mid] && nums[mid]<=nums[end]){
                return search(nums, start, mid-1);
            }else{
                return search(nums, mid+1, end);
            }
        }
        return search(nums, start, mid-1);
    }
}
