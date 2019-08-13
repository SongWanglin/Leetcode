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
    int minDiffInBST(TreeNode* root) {
        int res = INT_MAX, prev = INT_MAX;
        stack<TreeNode*> stk;
        TreeNode* temp = root;
        while( temp!=nullptr || !stk.empty() ){
            while(temp!=nullptr){
                stk.push(temp);
                temp = temp->left;
            }
            temp = stk.top(); stk.pop();
            if(prev!=INT_MAX) res = min(res, abs(temp->val-prev));
            prev = temp->val;
            temp = temp->right;
        }
        return res;
    }
};
