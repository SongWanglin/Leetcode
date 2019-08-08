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
    int maxHeight(TreeNode* root){
        if(root==nullptr) return 0;
        return max( 1+maxHeight(root->left), 1+maxHeight(root->right));
    }
public:
    bool isBalanced(TreeNode* root) {
        if(root==nullptr) return true;
        int left = maxHeight(root->left);
        int right = maxHeight(root->right);
        return abs(left-right)<=1 && isBalanced(root->left) && isBalanced(root->right);
    }
};
