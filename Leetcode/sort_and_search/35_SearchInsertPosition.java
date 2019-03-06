class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length, mid = 0;
        while (start<end){
            mid = start+(end-start)/2;
            if (nums[mid] < target){
               start = mid+1;
            } else{
               end = mid;
            }
        }
        //mid is either the largest number smaller than target,
        //or the smallest number less than/equal to target.
        return (nums[mid]<target)? mid+1: mid;
    }
}
