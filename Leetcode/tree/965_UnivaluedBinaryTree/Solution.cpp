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
public:
    bool isUnivalTree(TreeNode* root) {
        if(root==nullptr) return true;
        bool left = (root->left==nullptr)? true: root->val==root->left->val;
        bool right = (root->right==nullptr)? true: root->val==root->right->val;
        return left&&right&&isUnivalTree(root->left)&&isUnivalTree(root->right);
    }
};
