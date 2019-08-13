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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        boolean left = (root.left==null)?true:root.val==root.left.val;
        boolean right = (root.right==null)?true:root.val==root.right.val;
        return left&&right&&isUnivalTree(root.left)&&isUnivalTree(root.right);
    }
}
