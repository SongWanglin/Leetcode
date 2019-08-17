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
    TreeNode* dfs(TreeNode* root, TreeNode* tail){
        if(root==nullptr) return tail;
        TreeNode* res = dfs(root->left, root);
        root->left = nullptr;
        root->right = dfs(root->right, tail);
        return res;
    }
public:
    TreeNode* increasingBST(TreeNode* root) {
        return dfs(root, nullptr);
    }
};
