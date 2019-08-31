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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null) return null;
        int left = depth(root.left), right = depth(root.right);
        return (left==right)? root: (left > right)?subtreeWithAllDeepest(root.left):
                subtreeWithAllDeepest(root.right);
    }
        private int depth(TreeNode root){
            if(root==null) return 0;
            return 1+Math.max(depth(root.left), depth(root.right));
        }
}
