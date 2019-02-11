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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, 0, sum, new ArrayList<Integer>(), res);
        return res;
    }
        private void dfs(TreeNode root, int sum, int target,
                         List<Integer>path, List<List<Integer>> pathSum){
            if(root == null){
                return;
            }
            path.add(new Integer(root.val));
            sum = sum + root.val;
            if(root.left==null && root.right==null){
                if(sum==target){
                    pathSum.add(new ArrayList(path));
                }
                path.remove(path.size()-1);
                return;
            }else{
                dfs(root.left, sum, target, path, pathSum);
                dfs(root.right, sum, target, path, pathSum);
                path.remove(path.size()-1);
            }
        }
}
