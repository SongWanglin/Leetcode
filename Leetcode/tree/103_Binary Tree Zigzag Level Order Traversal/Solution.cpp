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
    void bfs(vector<vector<int>>&res,
             TreeNode* root, int level){
        if(root==nullptr) return;
        if(level>=res.size()) res.push_back({});
        bfs(res, root->left, level+1);
        bfs(res, root->right, level+1);
        if(level%2==0) res[level].push_back(root->val);
        else res[level].insert(res[level].begin(), 1, root->val);
    }
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> res;
        bfs(res, root, 0);
        return res;
    }
};
