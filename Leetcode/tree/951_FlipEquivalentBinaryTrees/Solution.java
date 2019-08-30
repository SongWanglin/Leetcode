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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
            int left1 = (root1.left==null)? -1: root1.left.val,
                right1 = (root1.right==null)? -1: root1.right.val,
                left2 = (root2.left==null)? -1: root2.left.val,
                right2 = (root2.right==null)? -1: root2.right.val;
        if(left1==right2 && left2==right1){
            TreeNode temp = root1.left;
            root1.left = root1.right;
            root1.right = temp;
        }
        boolean res = (root1.val==root2.val);
        return res&&flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
    }
}
