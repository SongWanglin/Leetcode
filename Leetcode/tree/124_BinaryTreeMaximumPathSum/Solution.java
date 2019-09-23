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
    public int maxPathSum(TreeNode root) {
        int[] res = {Integer.MIN_VALUE};
        dfs(root, res);
        return res[0];
    }
    private int dfs(TreeNode root, int[] res){
        if(root==null)
            return 0;
        int left = dfs(root.left, res), right = dfs(root.right, res);
        int returnVal = Math.max(root.val, Math.max(root.val+left, root.val+right));
        res[0] = Math.max(res[0], Math.max(returnVal, left+root.val+right));
        return returnVal;
    }
}
