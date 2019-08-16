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
    bool findTarget(TreeNode* root, int k) {
        unordered_set<int> set;
        stack<TreeNode*> stk;
        TreeNode *temp = root;
        while(temp!=NULL||!stk.empty()){
            while(temp!=nullptr){
                stk.push(temp);
                temp = temp->left;
            }
            temp = stk.top(); stk.pop();
            if(set.count(k-temp->val)!=0){
                return true;
            }
            set.insert(temp->val);
            temp = temp->right;
        }
        return false;
    }
};
/*/     Map<Integer, TreeNode> map = new HashMap<>();
        Stack<TreeNode> stk = new Stack<>();
        TreeNode temp = root;
        while( temp!=null || !stk.isEmpty() ){
            while(temp!=null){
                stk.push(temp);
                temp = temp.left;
            }
            temp = stk.pop();
            if(map.containsKey(k-temp.val)){
                return true;
            }
            map.put(temp.val, temp);
            temp = temp.right;
        }
        return false;/*/
