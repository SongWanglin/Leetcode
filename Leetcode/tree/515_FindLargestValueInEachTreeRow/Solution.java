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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        bfs(res, root, 0);
        return res;
    }
        private void bfs(List<Integer> list, TreeNode root,
                        int level){
            if( root==null ) return;
            if( level >= list.size() ) list.add(Integer.MIN_VALUE);
            bfs(list, root.left, level+1);
            bfs(list, root.right, level+1);
            int val = Math.max(list.get(level), root.val);
            list.set(level, val);
        }
}
