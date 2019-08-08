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
    TreeNode* searchBST(TreeNode* root, int val) {
        return (root==nullptr)? nullptr: (root->val==val)?root:
                (root->val > val)? searchBST(root->left, val): searchBST(root->right, val);
    }
};
