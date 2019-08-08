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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        bfs(res, root, 0);
        return res;
    }
        private void bfs(List<List<Integer>> res,
                         TreeNode root, int level){
            if(root==null) return;
            if(level>=res.size()) res.add(0, new ArrayList<Integer>());
            bfs(res, root.left, level+1);
            bfs(res, root.right, level+1);
            res.get(res.size()-1-level).add(root.val);
        }
}
