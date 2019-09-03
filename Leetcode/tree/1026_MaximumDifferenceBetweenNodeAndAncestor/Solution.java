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
    // top down
    public int maxAncestorDiff(TreeNode root){
        if(root==null)
            return 0;
        return dfs(root, root.val, root.val);
    }
        private int dfs(TreeNode root, int minimum, int maximum){
            if(root==null)
                return maximum-minimum;
            maximum = Math.max(root.val, maximum);
            minimum = Math.min(root.val, minimum);
            System.out.println(root.val+" "+minimum+" "+maximum);
            return Math.max(dfs(root.left, minimum, maximum), dfs(root.right, minimum, maximum));
        }
    /*/// bottome up
    public int maxAncestorDiff(TreeNode root) {
        if(root==null) return 0;
        //record the minimum value and maximum value of the subtree respectively
        int[] res = dfs(root);
        return res[0];
    }
        private int[] dfs(TreeNode root){
            if(root==null)
                return new int[]{0, Integer.MAX_VALUE, 0};
            if(root.left==null && root.right==null)
                return new int[]{0, root.val, root.val};
            int[] left= dfs(root.left);
            int[] right = dfs(root.right);
            int[] res = new int[]{0, Integer.MAX_VALUE, 0};
            int lower = Math.min(left[1], right[1]), higher = Math.max(left[2], right[2]);
            //lower bound
            res[1] = Math.min(root.val, lower);
            //higher bound
            res[2] = Math.max(root.val, higher);
            int dif1 = Math.max( Math.abs(root.val-lower), Math.abs(root.val-higher) );
            int dif2 = Math.max( left[0], right[0]);
            res[0] = Math.max(dif1, dif2);
            //System.out.println(res[0]+"\t"+res[1]+"\t"+res[2]);
            return res;
        }/*/
    /*/ //brute force
    class Solution {
        // stupid brute force, almost TLE for sure
        public int maxAncestorDiff(TreeNode root) {
            if(root==null) return 0;
            //record the minimum value and maximum value of the subtree respectively
            int max = dfs(root, root.val);
            int left = maxAncestorDiff(root.left);
            int right = maxAncestorDiff(root.right);
            return Math.max(max, Math.max(left, right));
        }
            private int dfs(TreeNode root, int val){
                if(root==null) return 0;
                int left = dfs(root.left, val);
                int right = dfs(root.right, val);
                int max = Math.abs(val-root.val);
                return Math.max(max, Math.max(left, right));
            }
    } /*/
}
