public class Solution {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        if(nums==null||nums.length==0)
            return -1;
        if(nums.length==1)
            return nums[0];
        int start = 0, end = nums.length-1, mid = 0;
        while(start<end){
            mid = (start+end)/2;
            if(mid>=1 && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[start]<=nums[mid] && nums[mid]>nums[end]){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return nums[start];
    }
}
