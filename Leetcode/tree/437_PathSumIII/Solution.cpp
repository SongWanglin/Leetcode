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
    int count(TreeNode* root, int sum){
        if(root==nullptr) return 0;
        return ((root->val==sum)?1:0)+count(root->left, sum-root->val)+count(root->right, sum-root->val);
    }
public:
    int pathSum(TreeNode* root, int sum) {
        if(root==nullptr) return 0;
        return count(root, sum)+pathSum(root->left, sum)+pathSum(root->right, sum);
    }
};
