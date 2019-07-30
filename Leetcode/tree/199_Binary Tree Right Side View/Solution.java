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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> levels = new ArrayList<>();
        bfs(levels, root, 1);
        for(List l: levels){
            /*/for(int i = 0; i<l.size(); i++){
                System.out.print(l.get(i)+" ");
            }/*/
            res.add( (int)l.get(l.size()-1) );
            //System.out.println(" ");
        }
        return res;
    }
        private void bfs(List<List<Integer>> list,
                         TreeNode root, int level){
            if(root==null){
                return;
            }
            if(level > list.size()){
                list.add(new ArrayList<Integer>());
            }
            bfs(list, root.left, level+1);
            bfs(list, root.right, level+1);
            list.get(level-1).add(root.val);
        }
}
