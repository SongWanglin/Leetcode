class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1) return;
        int i = nums.length - 2;
        while(i>=0 && nums[i]>=nums[i+1]) i--; // first i that breaks descending order
        if(i>=0){                              // if not completely descending
            int j = nums.length - 1;           // start from the end
            while(nums[j]<=nums[i]) {          // find rightmost first larger id j
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }
        private void swap(int[] A, int i, int j){
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }
        private void reverse(int[] A, int i, int j){
            while(i<j){
                swap(A, i, j);
                i++;    j--;
            }
        }
}
