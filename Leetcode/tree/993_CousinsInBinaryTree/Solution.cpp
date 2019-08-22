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
    TreeNode* getDepth(TreeNode* root, int val, int depth, int&level){
        if(!root) return nullptr;
        if( (root->left&& root->left->val==val)||(root->right&&root->right->val==val) ){
            level = depth+1;
            return root;
        }
        TreeNode* left = getDepth(root->left, val, depth+1, level);
        TreeNode* right = getDepth(root->right, val, depth+1, level);
        return (left)? left: (right)? right: nullptr;
    }
public:
    bool isCousins(TreeNode* root, int x, int y) {
        int x_depth = -1, y_depth = -1;
        TreeNode *x_parent = getDepth(root, x, 0, x_depth);
        TreeNode *y_parent = getDepth(root, y, 0, y_depth);
        return ( x_depth!=y_depth || x_parent==y_parent )? false: true;
    }
};
