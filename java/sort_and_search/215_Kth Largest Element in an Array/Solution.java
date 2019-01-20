class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i = 0; i< len; i++){
            if(queue.size()<k) queue.add(nums[i]);
            else if (nums[i]>queue.peek()){
                queue.remove(); queue.add(nums[i]);
            }
        }
        return queue.remove();
    }
}
