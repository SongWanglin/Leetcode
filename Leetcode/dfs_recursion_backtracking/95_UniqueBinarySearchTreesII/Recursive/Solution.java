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
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> res = new LinkedList<>();
        if(n==0)
            return res;
        bst(res, 1, n);
        return res;
    }
        private void bst(List<TreeNode> res, int start, int end){
            if(start > end){
                res.add(null);
                return;
            }
            for(int i = start; i<= end; i++){
                List<TreeNode> leftSubtrees = new LinkedList<>();
                bst(leftSubtrees, start, i-1);
                List<TreeNode> rightSubtrees = new LinkedList<>();
                bst(rightSubtrees, i+1, end);
                for(TreeNode left: leftSubtrees){
                    for(TreeNode right: rightSubtrees){
                        TreeNode root = new TreeNode(i);
                        root.left = left;
                        root.right = right;
                        res.add(root);
                    }
                }
            }
            return;
        }
}
