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
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        if(root == null)
            return null;
        if(go(root, limit, 0) == -1)
            return null;
        return root;
    }
        private int go(TreeNode root, int limit, int k){
            if(root.left==null && root.right==null){
                long t = k+root.val;
                if(t<limit){
                    return -1;
                }
            }
            int k1 = 0, k2 = 0;
            if(root.left!=null)
                k1 = go(root.left, limit, k+root.val);
            if(root.right!=null)
                k2 = go(root.right, limit, k+root.val);
            if(k1 == -1)
                root.left = null;
            if(k2 == -1)
                root.right = null;
            if(root.left==null && root.right==null){
                int t = k+root.val;
                if(t<limit){
                    return -1;
                }
            }
            if(k1==-1&&k2==-1)
                return -1;
            return 1;
        }
}

