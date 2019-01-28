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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        return DFS(root);
    }
        private int DFS(TreeNode root){
            if(root!=null&& root.left== null && root.right==null){
                return 1;
            }
            if(root.left==null){
                return 1+DFS(root.right);
            }
            if(root.right==null){
                return 1+DFS(root.left);
            }
            return Math.min(DFS(root.left)+1, DFS(root.right)+1);
        }
}
