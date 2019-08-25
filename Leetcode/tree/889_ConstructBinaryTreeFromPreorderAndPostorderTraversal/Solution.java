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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.add(new TreeNode(pre[0]));
        for(int i = 1, j = 0; i<pre.length; ++i){
            TreeNode node = new TreeNode(pre[i]);
            while(dq.getLast().val==post[j]){
                dq.pollLast(); ++j;
            }
            if(dq.getLast().left==null) dq.getLast().left = node;
            else dq.getLast().right = node;
            dq.add(node);
        }
        return dq.getFirst();
    }
}
