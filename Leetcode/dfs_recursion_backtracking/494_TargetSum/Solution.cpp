class Solution {
private:
    void dfs(vector<int>& nums, int index, int S, int& res){
        if(index>=nums.size()){
            if(S==0)
                res+=1;
            return;
        }
        dfs(nums, index+1, S-nums[index], res);
        dfs(nums, index+1, S+nums[index], res);
    }
public:
    int findTargetSumWays(vector<int>& nums, int S) {
        if(S > 1000)
            return 0;
        int res = 0;
        dfs(nums, 0, S, res);
        return res;
    }
};

