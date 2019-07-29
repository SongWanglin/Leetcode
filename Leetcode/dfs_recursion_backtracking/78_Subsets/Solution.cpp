class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
                vector<vector<int>> res;
                vector<int> sub;
                dfs(nums, 0, sub, res);
                return res;
            }
        private:
            void dfs(vector<int>& nums, int start, vector<int>& sub, vector<vector<int>>& res) {
                res.push_back(sub);
                for (int i = start; i < nums.size(); ++i) {
                    sub.push_back(nums[i]);
                    dfs(nums, i + 1, sub, res);
                    sub.pop_back();
                }
            }
};
