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
    public int maxLevelSum(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        bfs(res, root, 0);
        int max = Integer.MIN_VALUE, level = 0;
        for(int i = 0; i<res.size(); i++){
            int sum = 0;
            for(int j = 0; j<res.get(i).size(); j++){
                //System.out.print(res.get(i).get(j)+" ");
                sum += res.get(i).get(j);
            }
            //System.out.println(" ");
            if(sum > max){
                level = i+1;
                max = sum;
            }
        }
        return level;
    }
        private void bfs(List<List<Integer>> res,
                        TreeNode root, int level){
            if(root==null) return;
            if(level>=res.size()) res.add(new ArrayList<Integer>());
            bfs(res, root.left, level+1);
            bfs(res, root.right, level+1);
            res.get(level).add(root.val);
        }
}


