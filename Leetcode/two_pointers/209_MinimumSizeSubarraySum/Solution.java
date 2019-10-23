class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0)
            return 0;
        int res = Integer.MAX_VALUE, end = -1, sum = 0;
        for(int start = 0; start<nums.length-1;){
            if( sum<s && end<nums.length-1){
                sum += nums[++end];
            }else{
                sum -= nums[start++];
            }
            if(sum>=s)
                res = Math.min(res, end-start+1);
        }
        return (res!=Integer.MAX_VALUE)? res: 0;
    }
}
