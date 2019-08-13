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
    public int longestUnivaluePath(TreeNode root) {
    /*/
        if(root==null) return 0;
        int[] res = new int[1];
        univalueAtRoot(root, root.val, res);
        return res[0];
    }
        private int univalueAtRoot(TreeNode root, int val, int[] res){
            if(root==null) return 0;
            int left = univalueAtRoot(root.left, root.val, res);
            int right = univalueAtRoot(root.right, root.val, res);
            res[0] = Math.max(res[0], left+right);
            return (root.val==val)? 1+Math.max(left, right): 0;
        }
    public int longestUnivaluePath(TreeNode root) {/*/
        int[] res = new int[1];
        dfs(root, null, res);
        return res[0];
    }
        private int dfs(TreeNode current, TreeNode parent, int[] res){
            if (current==null)
                return 0;
            int left = dfs(current.left, current, res);
            int right = dfs(current.right, current, res);
            res[0] = Math.max( res[0], left+right );
            return (parent!=null && current.val == parent.val)? Math.max(left, right)+1: 0;
        }
}
