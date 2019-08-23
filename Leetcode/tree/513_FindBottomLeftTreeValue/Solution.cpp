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
    void bfs(TreeNode* root, vector<vector<int>> &list, int level){
        if(root==nullptr) return;
        if(level>=list.size()) list.push_back({});
        bfs(root->left, list, level+1);
        bfs(root->right, list, level+1);
        list[level].push_back(root->val);
    }
public:
    int findBottomLeftValue(TreeNode* root) {
        vector<vector<int>> res;
        bfs(root, res, 0);
        return res[res.size()-1][0];
    }
};
