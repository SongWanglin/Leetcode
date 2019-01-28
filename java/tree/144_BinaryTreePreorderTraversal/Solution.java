/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<>();
        stk.add(root);
        while(!stk.isEmpty()){
            TreeNode temp = stk.pop();
            if(temp==null){
                continue;
            }
            res.add(temp.val);
            stk.push(temp.right);
            stk.push(temp.left);
        }
        return res;
    }
}
