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
        if (root==null)
            return true;
        boolean resLeft = (root.left!=null)? (root.val == root.left.val):true;
        boolean resRight = (root.right!=null)? (root.val == root.right.val):true;
        boolean res = resLeft && resRight;
        return res && isUnivalTree(root.left) &&isUnivalTree(root.right);
    }
}
