/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return helper(0, 0, in.length-1, pre, in);
    }
        private TreeNode helper(int pStart, int iStart, int iEnd,
                       int[] pre, int[] in){
            if (iStart>iEnd || pStart>=pre.length){
                return null;
            }
            TreeNode root = new TreeNode(pre[pStart]);
            int rootIndex = 0;
            for (int i = iStart; i<=iEnd; i++){
                rootIndex = (in[i] == pre[pStart] )? i: rootIndex;
            }
            root.left = helper(pStart+1, iStart, rootIndex-1, pre, in);
            root.right = helper(pStart +(rootIndex - iStart) +1, rootIndex+1, iEnd, pre, in);
            return root;
        }
}
