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
    int dfs(TreeNode* root, int& res){
        if(root==nullptr) return 0;
        int left = dfs(root->left, res);
        int right = dfs(root->right, res);
        res += abs(left-right);
        return root->val+left+right;
    }
public:
    int findTilt(TreeNode* root) {
        int res = 0;
        dfs(root, res);
        return res;
    }
};
