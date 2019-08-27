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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1){
            TreeNode res = new TreeNode(v);
            res.left = root;
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i<size; i++){
                TreeNode temp = queue.poll();
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
                if(level==d-1){
                    TreeNode l = temp.left;
                    temp.left = new TreeNode(v);
                    temp.left.left = l;
                    TreeNode r = temp.right;
                    temp.right = new TreeNode(v);
                    temp.right.right = r;
                }
            }
            if(level==d-1){
                break;
            }
            level++;
        }
        return root;
    }
}
