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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode res = null;
        while(!queue.isEmpty()){
            res = queue.poll();
            if (res!=null){
                if(res.right!=null){
                    queue.add(res.right);
                }
                if(res.left!=null){
                    queue.add(res.left);
                }
            }
        }
        return res.val;
    }
}
