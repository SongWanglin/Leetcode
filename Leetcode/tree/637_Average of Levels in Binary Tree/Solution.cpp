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
    vector<double> averageOfLevels(TreeNode* root) {
        vector<double> res;
        if(!root) return res;
        deque<TreeNode*> dq;
        dq.push_back(root);
        while(!dq.empty()){
            int n = dq.size();
            double div = 0.0;
            for(int i = 0; i<n; i++){
                TreeNode* temp = dq.front(); dq.pop_front();
                div += temp->val;
                if(temp->left) dq.push_back(temp->left);
                if(temp->right) dq.push_back(temp->right);
            }
            div /= n;
            res.push_back(div);
        }
        return res;
    }
};
