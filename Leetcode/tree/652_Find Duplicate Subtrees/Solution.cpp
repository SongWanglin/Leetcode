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
    string preorder(TreeNode* root, unordered_map<string,vector<TreeNode*>>& map){
        if(root==nullptr) return "#";
        string serial = to_string(root->val)+","+preorder(root->left, map)+","+preorder(root->right, map);
        map[serial].push_back(root);
        return serial;
    }
public:
    vector<TreeNode*> findDuplicateSubtrees(TreeNode* root) {
        unordered_map<string, vector<TreeNode*>> map;
        vector<TreeNode*> res;
        preorder(root, map);
        for(auto it = map.begin(); it!=map.end(); ++it)
            if(it->second.size()>1) res.push_back(it->second[0]);
        return res;
    }
};
