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
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        int val = root->val;
        return (val<p->val && val<q->val)? lowestCommonAncestor(root->right, p, q):
                (val>p->val && val>q->val)? lowestCommonAncestor(root->left, p, q):
                root;
    }
};
