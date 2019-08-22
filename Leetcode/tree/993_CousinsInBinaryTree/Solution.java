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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = 0, size = queue.size();
            for(int i = 0; i<size; i++){
                TreeNode temp = queue.poll();
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
                if(temp.val==x||temp.val==y) count++;
                if(temp.left!=null && temp.right!=null){
                    if( (temp.left.val==x&&temp.right.val==y)||
                       (temp.left.val==y&&temp.right.val==x) )
                        return false;
                }
            }
            if(count==2) return true;
        }
        return false;
    }
}
