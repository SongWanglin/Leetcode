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
    /*/ //old solution
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);
        return Math.abs(leftHeight-rightHeight)<=1 && isBalanced(root.left)
                && isBalanced(root.right);
    }
        private int maxHeight(TreeNode root){
            if(root==null)  return 0;
            return Math.max( 1+maxHeight(root.left), 1+maxHeight(root.right) );
        }/*/
    public boolean isBalanced(TreeNode root){
        return getHeight(root)!=-1;
    }
        private int getHeight(TreeNode root){
            if(root==null) return 0;
            int left = getHeight(root.left), right = getHeight(root.right);
            if( left==-1 || right==-1 )
                return -1;
            if( Math.abs(left-right)>1)
                return -1;
            return Math.max(left, right)+1;
        }
}
