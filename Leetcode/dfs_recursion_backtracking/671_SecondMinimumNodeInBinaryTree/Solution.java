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
    public int findSecondMinimumValue(TreeNode root) {
        long[] res = {Long.MAX_VALUE, Long.MAX_VALUE};
        dfs(root, res);
        return (res[1]==Long.MAX_VALUE)? -1: (int)res[1];
    }
        private void dfs(TreeNode root, long[] res){
            if(root==null) return;
            dfs(root.left, res);
            if(root.val < res[0] ) { res[1] = res[0]; res[0] = (long)root.val; }
            if(root.val < res[1] && root.val>res[0]) res[1] = (long)root.val;
            dfs(root.right, res);
        }
}
