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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right ==null){
            return root.val == sum;
        } else{
            if (root.left!=null)
                root.left.val += root.val;
            if (root.right!=null)
                root.right.val += root.val;
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
