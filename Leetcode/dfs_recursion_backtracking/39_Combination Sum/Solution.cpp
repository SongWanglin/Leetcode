class Solution {
private:
    void dfs(vector<int>& candidates, int target, vector<vector<int>>& res, vector<int>& temp, int start){
        if(target<0)
            return;
        if(target==0){
            res.push_back(temp);
            return;
        }
        for(int i = start; i<candidates.size(); ++i){
            temp.push_back(candidates[i]);
            dfs(candidates, target-candidates[i], res, temp, i);
            temp.pop_back();
        }
    }
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> res;
        vector<int> temp;
        dfs(candidates, target, res, temp, 0);
        return res;
    }
};
