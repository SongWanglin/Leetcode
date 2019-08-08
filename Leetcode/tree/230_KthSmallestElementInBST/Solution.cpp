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
    int kthSmallest(TreeNode* root, int k) {
        stack<TreeNode*> stk;
        while(root!=nullptr){
            stk.push(root);
            root = root->left;
        }
        while(k!=0){
            TreeNode* temp = stk.top(); stk.pop();
            k--;
            if(k==0) return temp->val;
            temp = temp->right;
            while(temp!=nullptr){
                stk.push(temp);
                temp = temp->left;
            }
        }
        return -1;
    }
};
