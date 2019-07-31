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
    /*/
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> currentLevel = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return res;
        Queue<TreeNode> curlevel = new LinkedList<TreeNode>();
        curlevel.add(root);
        bfs(curlevel);
        return res;
    }
        private void bfs(Queue<TreeNode> current){
            Queue<TreeNode> nextlevel = new LinkedList<TreeNode>();
            while(!current.isEmpty()){
                TreeNode temp = current.poll();
                if(temp.left!=null) nextlevel.add(temp.left);
                if(temp.right!=null) nextlevel.add(temp.right);
                currentLevel.add(temp.val);
                if (current.isEmpty()){
                    res.add(currentLevel);
                    currentLevel = new ArrayList();
                    bfs(nextlevel);
                }
            }
        }/*/
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        bfs(res, root, 0);
        return res;
    }

            private void bfs(List<List<Integer>> list, TreeNode root, int level) {
                if(root == null) return;
                if(level >= list.size()) {
                    list.add(new LinkedList<Integer>());
                }
                bfs(list, root.left, level+1);
                bfs(list, root.right, level+1);
                list.get(level).add(root.val);
            }
}
