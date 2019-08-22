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
    public int sumNumbers(TreeNode root) {
        int[] res = new int[1];
        dfs(root, 0, res);
        return res[0];
    }
        private void dfs(TreeNode root, int val, int[] res){
            if(root==null) return;
            val *= 10; val += root.val;
            dfs(root.left, val, res);
            dfs(root.right, val, res);
            if(root.left==null && root.right==null){
                res[0]+=val;
                return;
            }
        }
}
