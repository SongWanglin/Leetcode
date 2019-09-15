class Solution {
    public int[] nextGreaterElements(int[] nums) {
        if(nums==null || nums.length==0) return nums;
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<2*n-1; ++i){
            while(!stack.empty() && nums[stack.peek()%n]<nums[i%n])
                res[stack.pop()] = nums[i%n];
            stack.push(i%n);
        }
        return res;
    }
}
