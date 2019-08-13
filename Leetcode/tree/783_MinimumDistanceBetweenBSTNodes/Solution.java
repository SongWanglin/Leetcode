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
    public int minDiffInBST(TreeNode root) {
        int min = Integer.MAX_VALUE;
        Integer prev = null;
        Stack<TreeNode> stk = new Stack<>();
        TreeNode temp = root;
        while(temp!=null || !stk.isEmpty()){
            while(temp!=null){
                stk.push(temp);
                temp = temp.left;
            }
            temp = stk.pop();
            if(prev!=null) min = Math.min(min, Math.abs(temp.val-prev));
            prev = temp.val;
            temp = temp.right;
        }
        return min;
    }
}
