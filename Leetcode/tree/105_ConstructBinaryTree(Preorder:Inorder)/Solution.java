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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length-1, preorder, inorder);
    }
        private TreeNode helper(int preStart, int inStart, int inEnd,
                               int[] preorder, int[] inorder){
            if (inStart>inEnd || preStart >= preorder.length){
                return null;
            }
            TreeNode root = new TreeNode( preorder[preStart] );
            int rootIndex = 0;
            for (int i = inStart; i <= inEnd; i++ ){
                rootIndex = (inorder[i] == root.val)? i: rootIndex;
            }
            root.left = helper(preStart+1, inStart, rootIndex-1, preorder, inorder);
            root.right = helper(preStart + (rootIndex-inStart) +1 , rootIndex+1, inEnd, preorder, inorder);
            // right sub tree start index in preorder = root index + number of left subtree nodes +1
            return root;
        }
}
