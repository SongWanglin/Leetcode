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
    /*/// recursive
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        dfs(res, root);
        return res;
    }
        private void dfs(List<Integer> res, TreeNode root){
            if(root==null) return;
            dfs(res, root.left);
            res.add(root.val);
            dfs(res, root.right);
        }/*/
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> stk = new Stack<>();
        TreeNode temp = root;
        while(temp!=null || !stk.isEmpty()){
            while(temp!=null){
                stk.push(temp);
                temp = temp.left;
            }
            temp = stk.pop();
            res.add(temp.val);
            temp = temp.right;
        }
        return res;
    }
}
