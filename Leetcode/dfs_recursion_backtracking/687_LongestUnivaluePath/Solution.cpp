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
    int dfs(TreeNode* current, TreeNode* parent, int &res){
        if(current==nullptr)
            return 0;
        int left = dfs(current->left, current, res);
        int right = dfs(current->right, current, res);
        res = max(res, left+right);
        return (parent!=nullptr && current->val==parent->val)?max(left, right)+1:0;
    }
public:
    int longestUnivaluePath(TreeNode* root) {
        int res = 0;
        dfs(root, nullptr, res);
        return res;
    }
};
