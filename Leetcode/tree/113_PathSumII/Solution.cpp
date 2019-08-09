/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
private:
    void dfs(vector<vector<int>> &res, vector<int>& temp,
                        TreeNode* root, int target){
            if(root==nullptr) return;
            if(root->left==nullptr && root->right==nullptr){
                if(target==root->val){
                    temp.push_back(root->val);
                    res.push_back(vector(temp));
                    if(temp.size()>0) temp.pop_back();
                }
                return;
            }
            temp.push_back(root->val);
            dfs(res, temp, root->left, target-root->val);
            dfs(res, temp, root->right, target-root->val);
            if(temp.size()>0) temp.pop_back();
        }
public:
    vector<vector<int>> pathSum(TreeNode* root, int sum) {
        vector<vector<int>> res;
        vector<int> temp;
        dfs(res, temp, root, sum);
        return res;
    }
};
