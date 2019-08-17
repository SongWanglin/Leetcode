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
    public int rangeSumBST(TreeNode root, int L, int R){
        if(root==null) return 0;
        if(root.val<L) return rangeSumBST(root.right, L, R);
        if(root.val>R) return rangeSumBST(root.left, L, R);
        return root.val+rangeSumBST(root.left, L, R)+rangeSumBST(root.right, L, R);
    }
    /*///iterative
    public int rangeSumBST(TreeNode root, int L, int R){
        Stack<TreeNode> stk = new Stack<>();
        int res = 0;
        TreeNode temp = root;
        while(temp!=null || !stk.isEmpty()){
            while(temp!=null){
                stk.push(temp);
                temp = temp.left;
            }
            temp = stk.pop();
            if(temp.val>=L && temp.val<=R) res+=temp.val;
            temp = temp.right;
        }
        return res;
    }/*/
    /*/// recursive solution
    public int rangeSumBST(TreeNode root, int L, int R) {
        int[] res = new int[1];
        dfs(res, root, L, R);
        return res[0];
    }
        private void dfs(int[] res, TreeNode root,
                        int L, int R){
            if(root==null) return;
            dfs(res, root.left, L, R);
            if(root.val>=L && root.val<=R) res[0]+=root.val;
            dfs(res, root.right, L, R);
        }/*/
}
