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
    public int rob(TreeNode root) {
        List<Integer> res = dfs(root);
        return Math.max(res.get(0), res.get(1));
    }
    private List<Integer> dfs(TreeNode root){
        if(root==null){
            Integer[] temp = {0, 0};
            return Arrays.asList(temp);
        }
        List<Integer> left = dfs(root.left), right = dfs(root.right);
        Integer[] temp = { Math.max(left.get(0), left.get(1))+Math.max(right.get(0), right.get(1)),
                              root.val + left.get(0) + right.get(0)};
        return Arrays.asList(temp);
    }
}
