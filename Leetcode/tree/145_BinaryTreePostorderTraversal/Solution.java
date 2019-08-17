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
    public List<Integer> postorderTraversal(TreeNode root){
        TreeNode temp = root;
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        while( temp!=null||!stk.isEmpty() ){
            while(temp!=null){
                stk.push(temp);
                res.add(0, temp.val);
                temp = temp.right;
            }
            temp = stk.pop();
            temp = temp.left;
        }
        return res;
    }
    /*/ // binary tree postorder traversal
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        dfs(res, root);
        return res;
    }
        private void dfs(List<Integer> res, TreeNode root){
            if(root==null) return;
            dfs(res, root.left);
            dfs(res, root.right);
            res.add(root.val);
        }/*/
}
