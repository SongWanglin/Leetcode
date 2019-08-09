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
        dfs(res, new LinkedList<Integer>(), root, sum);
        return res;
    }
        private void dfs(List<List<Integer>> res, List<Integer> temp,
                        TreeNode root, int target){
            if(root==null) return;
            if(root.left==null && root.right==null){
                if(target==root.val){
                    temp.add(root.val);
                    res.add(new ArrayList(temp));
                    if(temp.size()>0) temp.remove(temp.size()-1);
                }
                return;
            }
            temp.add(root.val);
            dfs(res, temp, root.left, target-root.val);
            dfs(res, temp, root.right, target-root.val);
            if(temp.size()>0) temp.remove(temp.size()-1);
        }
}
