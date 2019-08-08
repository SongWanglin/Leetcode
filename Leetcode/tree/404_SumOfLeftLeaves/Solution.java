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
    public int sumOfLeftLeaves(TreeNode root) {
        /*///iterative
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return 0;
        queue.offer(root);
        int sum = 0;
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.left!=null){
                queue.offer(temp.left);
                if(temp.left.left==null && temp.left.right==null)
                    sum += temp.left.val;
            }
            if(temp.right!=null) queue.offer(temp.right);
        }
        return sum; /*/
        if(root==null) return 0;
        if(root.left!=null && root.left.left==null && root.left.right==null)
            return root.left.val + sumOfLeftLeaves(root.right);
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }
}
