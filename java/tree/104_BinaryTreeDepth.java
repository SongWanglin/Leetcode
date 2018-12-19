class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int L = maxDepth(root.left);
        int R = maxDepth(root.right);
        return Math.max(L,R)+1;
    }   
}