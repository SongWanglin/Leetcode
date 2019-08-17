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
    vector<int> postorderTraversal(TreeNode* root) {
        TreeNode* temp = root;
        vector<int> res;
        stack<TreeNode*> stk;
        while( temp!=nullptr ||!stk.empty() ){
            while( temp!=nullptr){
                stk.push(temp);
                res.push_back(temp->val);
                temp = temp->right;
            }
            temp = stk.top(); stk.pop();
            temp = temp->left;
        }
        reverse(res.begin(), res.end());
        return res;
    }
};
