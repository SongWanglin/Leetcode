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
    /*/ fast and more concise solution
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
        }

        public int sum(TreeNode n, int s){
            if (n == null) return 0;
            if (n.right == null && n.left == null) return s*10 + n.val;
            return sum(n.left, s*10 + n.val) + sum(n.right, s*10 + n.val);
        }/*/
    public int sumNumbers(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        dfs(root,res,0);
        for(int num: res){
            sum += num;
        }
        return sum;
    }
        private void dfs(TreeNode root, List<Integer> res,
                         int temp){
            if(root==null){
                return;
            }
            temp*=10; temp+=root.val;
            if(root.left==null && root.right==null){
                res.add(temp);
            }
            dfs(root.left, res, temp);
            //if(temp.size()>0)temp.remove(temp.size()-1);
            dfs(root.right, res, temp);
            //if(temp.size()>0)temp.remove(temp.size()-1);
        }
}
