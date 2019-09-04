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
        int[] start = new int[1];
        return dfs(preorder, start, inorder, 0, inorder.length-1);
    }
        private TreeNode dfs(int[] preorder, int[] start,
                         int[] inorder, int inStart, int inEnd){
            if( start[0]>=preorder.length || inStart>inEnd )
                return null;
            TreeNode root = new TreeNode(preorder[start[0]]);
            int inorder_index = inStart;
            for(int i = inStart; i<=inEnd; i++){
                if(inorder[i]==preorder[start[0]])
                    inorder_index = i;
            }
            start[0]++;
            root.left = dfs(preorder, start, inorder, inStart, inorder_index-1);
            root.right = dfs(preorder, start, inorder, inorder_index+1, inEnd);
            return root;
        }
}
