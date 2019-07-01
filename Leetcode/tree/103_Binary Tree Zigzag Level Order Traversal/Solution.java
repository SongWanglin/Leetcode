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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean order = true;
        int size = 1;
        while(!q.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            for(int i = 0; i< size; i++){
                TreeNode node = q.poll();
                if(order){tmp.add(node.val);}
                else    {tmp.add(0, node.val);}
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            size = q.size();
            res.add(tmp);
            order = !order;
        }
        return res;
    }
}
