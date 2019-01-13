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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        TreeNode temp = root;
        while(temp!=null || !stk.isEmpty()){
            while(temp!=null){
                stk.push(temp);
                temp = temp.left;
            }
            temp = stk.pop();
            res.add(temp.val);
            temp = temp.right;
        }
        return res;
    }
}
