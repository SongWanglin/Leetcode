class Solution {
    public void sortColors(int[] nums) {
       int start = 0, end = nums.length-1, firstOne=0;
       while(start<=end){
           if (nums[start]==0){
                swap(nums, start , firstOne);
                firstOne++; start++;
           }else if(nums[start]==2){
                swap(nums, start, end);
                end--;
           }else{
               start++;
           }
       }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
