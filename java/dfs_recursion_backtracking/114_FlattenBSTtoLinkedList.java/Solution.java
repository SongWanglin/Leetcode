/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void flatten(TreeNode root) {
        // write your code here
        if (root == null)
            return;
        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(root);
        while(!stk.isEmpty()){
            TreeNode temp = stk.pop();
            if(temp.right!=null)
                stk.push(temp.right);
            if(temp.left!= null)
                stk.push(temp.left);
            if (!stk.isEmpty())
                temp.right = stk.peek();
            temp.left = null;
        }
    }
}
