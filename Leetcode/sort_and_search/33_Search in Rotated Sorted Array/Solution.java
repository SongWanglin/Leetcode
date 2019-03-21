class Solution {
    public int search(int[] nums, int target) {
        if (nums.length==0)
            return -1;
        int low = 0, high = nums.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid]>=nums[low]){
                if (target<nums[mid] && target>=nums[low])
                    high = mid-1;
                else
                    low = mid+1;
            }
            if (nums[mid]<=nums[high]){
                if (target>nums[mid] && target<=nums[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
}