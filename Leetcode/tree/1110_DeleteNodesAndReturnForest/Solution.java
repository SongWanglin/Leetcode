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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> res = new ArrayList<>();
        dfs_mark(root, to_delete);
        if(root.val!=-1) res.add(root);
        dfs_add(root, res);
        dfs_delete(root);
        return res;
    }
        private void dfs_mark(TreeNode root, int[] to_delete){
            if(root==null) return;
            for(int num: to_delete){
                    if(root.val == num){
                        root.val = -1;
                    }
                }
                dfs_mark(root.left, to_delete);
                dfs_mark(root.right, to_delete);
            }
        private void dfs_add(TreeNode root, List<TreeNode> res){
            if(root==null) return;
            if(root.val == -1){
                if(root.left!=null && root.left.val!=-1)
                    res.add(root.left);
                if(root.right!=null && root.right.val!=-1)
                    res.add(root.right);
            }
            dfs_add(root.left, res);
            dfs_add(root.right, res);
        }
        private TreeNode dfs_delete(TreeNode root){
            if(root==null) return null;
            root.left = dfs_delete(root.left);
            root.right = dfs_delete(root.right);
            if(root.val == -1) return null;
            return root;
        }
}
