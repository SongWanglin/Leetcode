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
     * @param root: the given BST
     * @param target: the given target
     * @return: the value in the BST that is closest to the target
     */
    public int closestValue(TreeNode root, double target) {
        // write your code here
        int lowerBound = Integer.MIN_VALUE;
        int higherBound = Integer.MAX_VALUE;
        TreeNode temp = root;
        while (temp!=null){
            if (temp.val < target){
                lowerBound = temp.val;
                temp = temp.right;
            } else if(temp.val > target){
                higherBound = temp.val;
                temp = temp.left;
            }
        }
        return (lowerBound==Integer.MIN_VALUE)? higherBound:
            (higherBound==Integer.MAX_VALUE)? lowerBound:
            (target-lowerBound<higherBound-target)? lowerBound:
            higherBound;
    }
}
