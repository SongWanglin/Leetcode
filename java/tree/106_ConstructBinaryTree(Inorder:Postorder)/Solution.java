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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder.length-1, 0,inorder.length-1, postorder, inorder);
    }
        private TreeNode helper(int postEnd, int inStart, int inEnd,
                               int[] postorder, int[] inorder){
            if(inStart>inEnd ||postEnd<0){
                return null;
            }
            TreeNode root = new TreeNode( postorder[postEnd] );
            int rootIndex = 0;
            for (int i = inStart; i <= inEnd; i++ ){
                rootIndex = (inorder[i] == root.val)? i: rootIndex;
            }
            root.right = helper(postEnd-1, rootIndex+1, inEnd, postorder, inorder);
            root.left = helper(postEnd - (inEnd - rootIndex) -1 , inStart, rootIndex-1, postorder, inorder);
            return root;
        }
}
