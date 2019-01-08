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
    int res = 0;
    // res is the sum of longest left path and longest right path
    public int longestUnivaluePath(TreeNode root) {
        dfs(root, null);
        // dfs return 0 for root node, and return the longest direct path length from child node to its parent node
        return res;
    }
        private int dfs(TreeNode node, TreeNode parent){
            if (node==null )
                return 0;
            // terminating condition for recursion
            int left = dfs(node.left, node);
            int right = dfs(node.right, node);
            res = (res>left+right)? res: left+right;
            // result is the sum of 2 direct paths' length from child node
            return (parent!=null&&node.val == parent.val)? Math.max(left, right)+1: 0;
        }
}
