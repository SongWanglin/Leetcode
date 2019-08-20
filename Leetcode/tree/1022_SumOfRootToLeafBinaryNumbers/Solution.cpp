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
        val = val*2+root->val;
        dfs(root->left, val, res);
        dfs(root->right, val, res);
        if(root->left==nullptr && root->right==nullptr){
            res += val;
            return;
        }
    }
public:
    int sumRootToLeaf(TreeNode* root) {
        int res = 0;
        dfs(root, 0, res);
        return res;
    }
};
