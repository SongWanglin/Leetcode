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
    public boolean isValidBST(TreeNode root) {
        return validBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
        private boolean validBST(TreeNode root, long lowBound, long highBound){
            if (root==null) return true;
            return root.val>lowBound && root.val<highBound && validBST(root.left, lowBound, root.val)
                    && validBST(root.right, root.val, highBound);
        }
}
