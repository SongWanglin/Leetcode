/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class BSTIterator {
    stack<TreeNode *> stk;
    TreeNode* current = nullptr;
public:
    BSTIterator(TreeNode* root) {
        current = root;
    }

    /** @return the next smallest number */
    int next() {
        while(current!=nullptr){
            stk.push(current);
            current = current->left;
        }
        TreeNode* res = stk.top(); stk.pop();
        current = res->right;
        return res->val;
    }

    /** @return whether we have a next smallest number */
    bool hasNext() {
        return (!stk.empty())||current!=nullptr;
    }
};

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator* obj = new BSTIterator(root);
 * int param_1 = obj->next();
 * bool param_2 = obj->hasNext();
 */
