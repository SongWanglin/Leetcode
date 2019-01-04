class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length, pivot = k%n;
            reverse(nums, 0, n-pivot-1);
            reverse(nums, n-pivot, n-1);
            reverse(nums, 0, n-1);
    }
        private void reverse(int[] nums, int i, int j){
            if(i>j)
                return;
            int start = i, end = j, tmp;
            while(start<end){
                tmp = nums[start];
                nums[start]=nums[end];
                nums[end]=tmp;
                start++; end--;
            }
        }
}
