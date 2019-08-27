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
    /*/
    public TreeNode bstFromPreorder(int[] preorder) {
        return dfs(preorder, 0, preorder.length-1);
    }
        private TreeNode dfs(int[] preorder, int start, int end){
            if(start >  end) return null;
            if(start == end) return new TreeNode(preorder[start]);
            int left = end+1, right = end+1;
            boolean leftFound = false, rightFound = false;
            for(int i = start; i<=end; i++){
                if( !leftFound && preorder[i] < preorder[start] ){
                    left = i;
                    leftFound = true;
                }
                if( !rightFound && preorder[i] > preorder[start] ){
                    right = i;
                    rightFound = true;
                }
            }
            TreeNode root = new TreeNode(preorder[start]);
            root.left = dfs(preorder, left, right-1);
            root.right = dfs(preorder, right, end);
            return root;
        }/*/
    public TreeNode bstFromPreorder(int[] A) {
        int[] counter = {0};
        return bstFromPreorder(A, counter, Integer.MAX_VALUE);
    }

    public TreeNode bstFromPreorder(int[] A, int[] i, int bound) {
        if (i[0] == A.length || A[i[0]] > bound) return null;
        TreeNode root = new TreeNode(A[i[0]++]);
        root.left = bstFromPreorder(A, i, root.val);
        root.right = bstFromPreorder(A, i, bound);
        return root;
    }
}
