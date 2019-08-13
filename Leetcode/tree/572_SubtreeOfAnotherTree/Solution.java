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
    // recursive
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null) return false;
        return sameTree(s, t)||isSubtree(s.left, t)||isSubtree(s.right, t);
    }
        private boolean sameTree(TreeNode s, TreeNode t){
            if(s==null && t==null) return true;
            if(s==null ^ t==null) return false;
            return (s.val==t.val)&&sameTree(s.left, t.left)&&sameTree(s.right, t.right);
        }/*/
     public boolean isSubtree(TreeNode s, TreeNode t) {
            String spreorder = generatepreorderString(s);
            String tpreorder = generatepreorderString(t);

            return spreorder.contains(tpreorder) ;
        }
        public String generatepreorderString(TreeNode s){
            StringBuilder sb = new StringBuilder();
            Stack<TreeNode> stacktree = new Stack();
            stacktree.push(s);
            while(!stacktree.isEmpty()){
               TreeNode popelem = stacktree.pop();
               if(popelem==null)
                  sb.append(",#"); // Appending # inorder to handle same values but not subtree cases
               else
                  sb.append(","+popelem.val);
               if(popelem!=null){
                    stacktree.push(popelem.right);
                    stacktree.push(popelem.left);
               }
            }
            return sb.toString();
        }/*/
}
