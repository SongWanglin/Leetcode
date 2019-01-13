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
        }
}
