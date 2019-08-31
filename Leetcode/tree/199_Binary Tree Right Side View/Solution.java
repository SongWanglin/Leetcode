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
    public List<Integer> rightSideView(TreeNode root){
        List<List<Integer>> levels = new ArrayList<>();
        bfs(levels, root, 0);
        List<Integer> res = new LinkedList<>();
        for(int i = 0; i<levels.size(); ++i){
            res.add(levels.get(i).get(0));
        }
        return res;
    }
        private void bfs(List<List<Integer>> list,
                         TreeNode root, int level){
            if(root==null)
                return;
            if(level >= list.size()){
                list.add(new ArrayList<Integer>());
            }
            bfs(list, root.left, level+1);
            bfs(list, root.right, level+1);
            list.get(level).add(0, root.val);
        }
    /*/// iterative solution
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new LinkedList<>();
        if(root==null) return res;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i<size; ++i){
                TreeNode temp = queue.poll();
                level.add(0, temp.val);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            levels.add(level);
        }
        for(int i = 0; i<levels.size(); ++i){
            res.add(levels.get(i).get(0));
        }
        return res;
    }/*/
}
