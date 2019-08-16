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
    public String tree2str(TreeNode t) {
        if(t==null) return "";
        String res = t.val + "";
        String left = tree2str(t.left);
        String right = tree2str(t.right);
        if(left==""&&right=="") return res;
        if(left == "") return res+"()"+"("+right+")";
        if(right == "") return res+"("+left+")";
        return res + "("+left+")"+"("+right+")";
    }
}
