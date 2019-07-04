class Solution {
    public int findDuplicate(int[] nums) {
        /*/ Sort and brute force
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1]==nums[i]){
                return nums[i-1];
            }
        }
        return -1; /*/
        int slow = nums[0], fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        int head = nums[0];
        while (head != slow) {
            head = nums[head];
            slow = nums[slow];
        }
        return head;
    }
}
