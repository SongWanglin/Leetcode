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
    bool sameTree(TreeNode* s, TreeNode* t){
    if(s==nullptr && t==nullptr) return true;
    if(s==nullptr ^ t==nullptr) return false;
    return (s->val==t->val)&&sameTree(s->left, t->left)&&sameTree(s->right, t->right);
}
public:
    bool isSubtree(TreeNode* s, TreeNode* t) {
        if(s==nullptr) return false;
        return sameTree(s, t) || isSubtree(s->left, t) || isSubtree(s->right, t);
    }
};
