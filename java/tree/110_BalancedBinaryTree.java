class Solution {
    public int getHeight(TreeNode root){
        if (root == null) return 0;
        int L = getHeight(root.left);
        int R = getHeight(root.right);
        if ( (L==-1)||(R==-1)||(Math.abs(L-R)>1) )
            return -1;
        return Math.max(L,R)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return getHeight(root)!=-1;
    }
}
