class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length-1, mid = 0;
        while(start<end){
            mid = start+(end-start)/2;
            if (nums[mid+1]>nums[mid]){
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return (nums[start]>nums[end])? start: end;
    }
}
