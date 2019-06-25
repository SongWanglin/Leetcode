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
    public boolean isSymmetric(TreeNode root) {
        return (root==null)||Symmetric(root.left, root.right);
    }
        private boolean Symmetric(TreeNode left, TreeNode right){
            if(left==null && right ==null) return true;
            if(left==null ^ right==null) return false;
            if (left.val!=right.val){
                return false;
            }
            return Symmetric(left.left, right.right)&&Symmetric(left.right,                             right.left);
        }
}
