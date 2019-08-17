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
    public TreeNode increasingBST(TreeNode root) {
        /*/// iterative solution
        Stack<TreeNode> stk = new Stack<>();
        TreeNode dummy = new TreeNode(-1), p = dummy, temp = root;
        while( temp!=null||!stk.isEmpty() ){
            while(temp!=null){
                stk.push(temp);
                temp = temp.left;
            }
            temp = stk.pop();
            temp.left = null; p.right = temp; p = p.right;
            //System.out.println(temp.val);
            temp = temp.right;
        }
        return dummy.right;/*/
        return dfs(root, null);
    }
        private TreeNode dfs(TreeNode root, TreeNode tail){
            if(root==null) return tail;
            TreeNode res = dfs(root.left, root);
            root.left = null;
            root.right = dfs(root.right, tail);
            return res;
        }
}
