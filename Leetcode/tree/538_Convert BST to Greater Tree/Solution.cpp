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
    void dfs(TreeNode* root, int& curMax){
        if(root==nullptr) return;
        dfs(root->right, curMax);
        root->val+=curMax; curMax=root->val;
        dfs(root->left, curMax);
    }
public:
    TreeNode* convertBST(TreeNode* root) {
        int curMax = 0;
        dfs(root, curMax);
        return root;
    }
};
