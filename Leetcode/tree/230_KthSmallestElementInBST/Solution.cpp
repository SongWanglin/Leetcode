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
    /*/// recursive
    int kthSmallest(TreeNode* root, int& k) {
        if (root) {
            int x = kthSmallest(root->left, k);
            return k==0 ? x : !--k ? root->val : kthSmallest(root->right, k);
        }
    }
    /*/
    //iterative solution
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
