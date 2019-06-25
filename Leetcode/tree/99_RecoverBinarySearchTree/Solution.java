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
    public void recoverTree(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode firstNode = null;
        TreeNode secondNode = null;
        TreeNode pre = new TreeNode(Integer.MIN_VALUE);
        TreeNode p = root;
        while(p!=null || !stack.isEmpty() ){
            while( p!=null ){
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            // check if previous node value is greater than current node value during in order traversal
            if(firstNode == null && pre.val > p.val) firstNode = pre;
            if(firstNode != null && pre.val > p.val) secondNode = p;
            /************/
            pre = p;
            p = p.right;
        }
        int tmp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = tmp;
    }
}


/*/ //recursive inorder traversal
class Solution {
    TreeNode firstNode = null;
    TreeNode secondNode = null;
    TreeNode preNode = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        in_order(root);
        int tmp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = tmp;
    }

    private void in_order(TreeNode root) {
        if (root == null) return;
        in_order(root.left);
        if (firstNode == null && preNode.val > root.val) firstNode = preNode;
        if (firstNode != null && preNode.val > root.val) secondNode = root;
        preNode = root;
        in_order(root.right);
    }
}/*/
