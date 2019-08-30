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
    bool dfs(TreeNode* root, long long lowerBound, long long higherBound){
        if(!root)
            return true;
        bool res = (root->val>lowerBound)&&(root->val<higherBound);
        return res && dfs(root->left, lowerBound, root->val) && dfs(root->right, root->val, higherBound);
    }
public:
    bool isValidBST(TreeNode* root) {
        return dfs(root, LLONG_MIN, LLONG_MAX);
    }
};
