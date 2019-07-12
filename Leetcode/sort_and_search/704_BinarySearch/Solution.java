class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1, mid;
        do{
            mid = start + (end - start)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }while(start<=end);
        return -1;
    }
}
