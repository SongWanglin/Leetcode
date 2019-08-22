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
    void dfs(TreeNode* root, int val, int &res){
        if(root==nullptr) return;
        val*=10; val+=root->val;
        dfs(root->left, val, res);
        dfs(root->right, val, res);
        if(!root->left && !root->right){
            res+=val;
            return;
        }
    }
public:
    int sumNumbers(TreeNode* root) {
        int res = 0;
        dfs(root, 0, res);
        return res;
    }
};
