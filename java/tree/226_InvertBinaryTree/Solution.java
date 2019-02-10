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
    public TreeNode invertTree(TreeNode root) {
        /* recursive */
        /*/
        if ( root == null) { return root; }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
        /*/
        /* iterative */
        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);
        TreeNode node, tmp;
        while(!stk.isEmpty()){
            node = stk.pop();
            if(node!=null){
                tmp = node.left;
                node.left = node.right;
                node.right = tmp;
                stk.push(node.left);
                stk.push(node.right);
            }
        }
        return root;
        }
}
