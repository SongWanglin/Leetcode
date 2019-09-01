class Solution {
    public int dietPlanPerformance(int[] nums, int k, int lower, int upper) {
        int res = 0;
        int i, j;
        for(i = 0; i<=nums.length-k;i++){
            int sum = 0;
            for(j = i; j-i<k && j<nums.length; j++){
                sum += nums[j];
            }
            if(sum>=lower && sum<=upper){
                continue;
            }else if(sum<lower){
                res--;
            }else{
                res++;
            }
        }
        return res;
    }
}
