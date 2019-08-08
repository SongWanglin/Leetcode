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
    TreeNode* dfs(vector<int>&nums,
                  int start, int end){
        if(start>end) return nullptr;
        int mid = (start+end)/2;
        TreeNode* root=new TreeNode(nums[mid]);
        root->left = dfs(nums, start, mid-1);
        root->right = dfs(nums, mid+1, end);
        return root;
    }
public:
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        if(nums.size()==0) return nullptr;
        return dfs(nums, 0, nums.size()-1);
    }
};
