class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copy = nums.clone();
        Arrays.sort(nums);
        int start = 0, end = nums.length-1;
        while(start<=end && nums[start]==copy[start]) start+=1;
        while(end>=0 && nums[end]==copy[end]) end-=1;
        return (end-start>=0)? end-start+1: 0;
    }
}
