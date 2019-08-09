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
    void dfs(TreeNode* root, string s, vector<string>& res){
        if(!root->left && !root->right){
            res.push_back(s);
            return;
        }
        if(root->left!=nullptr) dfs(root->left, s+"->"+to_string(root->left->val), res);
        if(root->right!=nullptr) dfs(root->right, s+"->"+to_string(root->right->val), res);
    }
public:
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> res;
        if(root==nullptr) return res;
        dfs(root, to_string(root->val), res);
        return res;
    }
};
