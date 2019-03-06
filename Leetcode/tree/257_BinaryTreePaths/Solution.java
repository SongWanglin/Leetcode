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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if(root == null)
            return res;
        DFS(root, res, "");
        return res;
    }
        private void DFS(TreeNode root, List<String>res, String str){
            if(root==null)
                return;
            if(root!=null && root.left==null && root.right==null){
                res.add(str+String.valueOf(root.val));
                return;
            }
            DFS(root.left, res, str+String.valueOf(root.val)+"->");
            DFS(root.right, res, str+String.valueOf(root.val)+"->");
        }
}
