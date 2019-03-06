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
    /* dynamic programming approach */
    public int pathSum(TreeNode root, int sum) {
        int[] path = new int[1000];
        return helper(root,sum, path,0);
    }
    private int helper(TreeNode root, int sum, int[] path, int level) {
        int count = 0;
        if (root == null) return 0;
        if (level == 0) path[level] = root.val;
        else path[level] = path[level - 1] + root.val;
        if (path[level] == sum) count++;
        for (int i = 0; i < level; i++) {
            if (path[level] - path[i] == sum) count++;
        }
        count = count + helper(root.left, sum, path, level + 1);
        count = count + helper(root.right, sum, path, level + 1);
        return count;
    }
    /* intuitive recursive solution */
    /*/
    public int pathSum(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
        return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
        private int dfs(TreeNode root, int sum){
            if(root == null){
                return 0;
            }
            sum -= root.val;
            return ( (sum ==0 )?1:0 ) + dfs(root.left, sum)+dfs(root.right, sum);
        }
        /*/
}
