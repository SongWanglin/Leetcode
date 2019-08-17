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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        dfs(res, root);
        return res;
    }
        private void dfs(List<Integer> res, TreeNode root){
            if(root==null) return;
            res.add(root.val);
            dfs(res, root.left);
            dfs(res, root.right);
        }
}
