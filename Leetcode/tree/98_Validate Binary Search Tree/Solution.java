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
    public boolean isValidBST(TreeNode root){
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
        private boolean dfs(TreeNode root, long lowerBound, long higherBound){
            if(root==null)
                return true;
            boolean res = (root.val>lowerBound)&&(root.val<higherBound);
            return res && dfs(root.left, lowerBound, root.val) &&
                    dfs(root.right, root.val, higherBound);
        }
    /*/ //brute force
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        boolean res = dfs(root.left, root.val, true) && dfs(root.right, root.val, false);
        return res &&isValidBST(root.left) &&isValidBST(root.right);
    }
        private boolean dfs(TreeNode root,
                            int val, boolean left){
            if(root==null){
                return true;
            }
            boolean res =  (left)? (root.val<val): (root.val>val);
            return res && dfs(root.left, val, left)
                    && dfs(root.right, val, left);
        }/*/
}
