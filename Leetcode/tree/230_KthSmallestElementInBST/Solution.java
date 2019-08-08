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
     //recursive
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
            return 0;
        int leftCount = nodeCount(root.left);
        if( k > leftCount+1 )
            return kthSmallest(root.right, k-leftCount-1);
        if( k <= leftCount)
            return kthSmallest(root.left, k);
        return root.val;
    }
        private int nodeCount(TreeNode root){
            if(root==null) return 0;
            return 1+nodeCount(root.left)+nodeCount(root.right);
        }
    /*/ //iterative
    public int kthSmallest(TreeNode root, int k){
        Stack<TreeNode> stk = new Stack<>();
        while(root!=null){
            stk.push(root);
            root = root.left;
        }
        while(k!=0){
            TreeNode temp = stk.pop();
            k--;
            if(k==0) return temp.val;
            temp = temp.right;
            while(temp!=null){
                stk.push(temp);
                temp = temp.left;
            }
        }
        return -1;
    }/*/
}
