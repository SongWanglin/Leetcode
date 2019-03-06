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
    private ArrayList<Double> res = new ArrayList<>();
    private LinkedList<TreeNode> cur_level = new LinkedList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null)
            return res;
        cur_level.add(root);
        bfs(cur_level, new LinkedList<TreeNode>());
        return res;
    }
        private void bfs(LinkedList<TreeNode> cur_level,
                         LinkedList<TreeNode> next_level){
            long sum = 0, count = 0;
            while(!cur_level.isEmpty()){
                TreeNode tmp = cur_level.poll();
                if(tmp.left!=null) next_level.add(tmp.left);
                if(tmp.right!=null) next_level.add(tmp.right);
                sum+=tmp.val; count++;
                if(cur_level.isEmpty()){
                    res.add((double)sum/count);
                    cur_level = next_level;
                    bfs(cur_level, new LinkedList<TreeNode>());
                }
            }
        }
}
