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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null)
            return res;
        Queue<TreeNode> curlevel = new LinkedList<TreeNode>();
        curlevel.add(root);
        bfs(curlevel);
        Collections.reverse(res);
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
/*/
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> res = new LinkedList<List<Integer>>();
            levelMaker(res, root, 0);
            return res;
        }

            public void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
                if(root == null) return;
                if(level >= list.size()) {
                    list.add(0, new LinkedList<Integer>());
                }
                levelMaker(list, root.left, level+1);
                levelMaker(list, root.right, level+1);
                list.get(list.size()-level-1).add(root.val);
            }
/*/
