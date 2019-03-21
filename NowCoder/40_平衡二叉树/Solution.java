public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        return (Math.abs(left-right)<=1)&&IsBalanced_Solution(root.left)
            &&IsBalanced_Solution(root.right);
    }
        private int treeDepth(TreeNode root){
            if(root==null){
                return 0;
            }
            int left = treeDepth(root.left);
            int right = treeDepth(root.right);
            return (left>right)? left+1: right+1;
        }
}
