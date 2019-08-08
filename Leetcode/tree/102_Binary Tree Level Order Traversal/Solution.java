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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        bfs(res, root, 0);
        return res;
    }
        private void bfs(List<List<Integer>> res,
                        TreeNode root, int level){
            if(root == null){
                return;
            }
            if(level>=res.size()){
                res.add(new ArrayList<Integer>());
            }
            bfs(res, root.left, level+1);
            bfs(res, root.right, level+1);
            res.get(level).add(root.val);
        }
    /*/ // iterative
    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root == null) return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            int level_count = queue.size();
            List<Integer> temp = new LinkedList<Integer>();
            for(int i=0; i<level_count; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                temp.add(queue.poll().val);
            }
            res.add(temp);
        }
        return res;
    }/*/
}
