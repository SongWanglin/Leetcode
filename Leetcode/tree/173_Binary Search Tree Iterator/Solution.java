/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    private Stack<TreeNode> stack;
    private TreeNode current = null;
    public BSTIterator(TreeNode root) {
        current = root;
        stack = new Stack<>();
    }

    /** @return the next smallest number */
    public int next() {
        while(current!=null){
            stack.push(current);
            current = current.left;
        }
        TreeNode res = stack.pop();
        current = res.right;
        return res.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty() || current!=null;
    }
}
/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
