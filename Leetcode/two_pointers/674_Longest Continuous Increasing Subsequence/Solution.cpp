class Solution {
public:
    int findLengthOfLCIS(vector<int>& nums) {
        if(nums.size()==0) return 0;
        int res = 1, slow = -1, fast = 0;
        for(fast = 0; fast < nums.size()-1; ++fast){
            if(nums[fast]<nums[fast+1]){
                continue;
            }
            res = max(fast-slow, res);
            slow = fast;
        }
        return max(res, fast-slow);
    }
};
