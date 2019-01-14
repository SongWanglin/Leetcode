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
     * @param root: the root of binary tree
     * @return: the root of the minimum subtree
     */
    public TreeNode res = null;
    public int minSum = Integer.MAX_VALUE;
    public TreeNode findSubtree(TreeNode root) {
        // write your code here
        sum(root);
        return res;
    }
        private int sum(TreeNode temp){
            if(temp==null){
                return 0;
            }
            int total = sum(temp.left)+sum(temp.right)+temp.val;
            if( total < minSum){
                minSum = total;
                res = temp;
            }
            return total;
        }
}
