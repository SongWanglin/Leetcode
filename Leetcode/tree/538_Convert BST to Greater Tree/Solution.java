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
    public TreeNode convertBST(TreeNode root) {
        Stack<TreeNode> stk = new Stack<>();
        TreeNode temp = root; int cur = 0;
        while( temp!=null || !stk.isEmpty() ){
            while(temp!=null){
                stk.push(temp);
                temp = temp.right;
            }
            temp = stk.pop();
            temp.val += cur; cur = temp.val;
            temp = temp.left;
        }
        return root;
    }/*/
    // recursive solution
    public TreeNode convertBST(TreeNode root){
        int[] curMax = new int[1];
        dfs(root, curMax);
        return root;
    }
        private void dfs(TreeNode root, int[] curMax){
            if(root==null) return;
            dfs(root.right, curMax);
            root.val+=curMax[0]; curMax[0]=root.val;
            dfs(root.left, curMax);
        }
}
