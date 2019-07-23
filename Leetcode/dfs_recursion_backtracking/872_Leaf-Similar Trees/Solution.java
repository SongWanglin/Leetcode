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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> res1 = new ArrayList<>();
        ArrayList<Integer> res2 = new ArrayList<>();
        dfs(res1, root1);
        dfs(res2, root2);
        if(res1.size()!=res2.size())
            return false;
        for(int i = 0; i<res1.size(); i++){
            if(res1.get(i)!=res2.get(i))
                return false;
        }
        return true;
        //return res1.equals(res2);
    }
        private void dfs(List<Integer> res, TreeNode root){
            if(root==null)
                return;
            if(root.left==null && root.right==null){
                res.add(root.val);
                return;
            }
            dfs(res, root.left);
            dfs(res, root.right);
        }
}
