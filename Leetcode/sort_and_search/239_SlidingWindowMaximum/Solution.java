class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || k<1){
            return new int[0];
        }
        int[] res = new int[nums.length-k+1];
        Deque<Integer> q = new LinkedList<>();
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            // keep a k size window
            while(!q.isEmpty() && q.peek()<i-k+1){
                q.poll();
            }
            // remove all numbers's indices in window that is smaller than the                     // incoming number
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            q.add(i);
            if(i>=k-1){
                res[index++] = nums[ q.peek() ];
            }
        }
        return res;
    }
}
