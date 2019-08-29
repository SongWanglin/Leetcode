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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0)
            return null;
        return dfs(nums, 0, nums.length-1);
    }
        private TreeNode dfs(int[] nums, int lower,
                             int higher){
            if(lower>higher){
                return null;
            }
            int maxValue = nums[lower], maxIndex = lower;
            for(int i = lower; i<=higher; ++i){
                if(nums[i]>maxValue){
                    maxValue = nums[i];
                    maxIndex = i;
                }
            }
            TreeNode root = new TreeNode(maxValue);
            root.left = dfs(nums, lower, maxIndex-1);
            root.right = dfs(nums, maxIndex+1, higher);
            return root;
        }
}
