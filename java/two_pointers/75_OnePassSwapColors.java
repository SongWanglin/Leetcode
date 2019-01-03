class Solution {
    public void sortColors(int[] nums) {
       int start = 0, end = nums.length-1, pivot_idx=0;
       while(start<=end){
           if (nums[start]==0){
                swap(nums, start , pivot_idx);
                pivot_idx++;
           }else if(nums[start]==2){
                swap(nums, end, start);
                end--; start--;
           }
           start++;
       }
    }

    public void swap(int[] A, int i, int j){
        int tmp = A[j]; A[j] = A[i]; A[i] = tmp;
    }
}
