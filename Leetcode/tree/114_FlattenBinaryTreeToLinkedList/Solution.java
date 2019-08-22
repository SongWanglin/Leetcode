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
    private TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root==null) return;
        TreeNode left = root.left, right = root.right;
        flatten(right);
        flatten(left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
