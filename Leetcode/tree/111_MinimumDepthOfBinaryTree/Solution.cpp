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
    int minDepth(TreeNode* root) {
        if(root==nullptr)
            return 0;
        if(root->left==nullptr && root->right==nullptr)
            return 1;
        return (root->left==nullptr)? 1+minDepth(root->right):
                (root->right==nullptr)? 1+minDepth(root->left):
                min(1+minDepth(root->left), 1+minDepth(root->right));
    }
};
