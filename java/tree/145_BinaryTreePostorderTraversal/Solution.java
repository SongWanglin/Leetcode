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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        TreeNode temp = root;
        while (!queue.isEmpty() || temp!=null){
            if(temp!=null){
                queue.push (temp);
                res.addFirst(temp.val);
                temp = temp.right;
            } else{
                temp = queue.pop().left;
            }
        }
        return res;
    }
}
