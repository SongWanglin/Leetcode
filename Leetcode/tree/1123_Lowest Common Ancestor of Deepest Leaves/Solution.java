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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null)return null;
        List<TreeNode> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            list.clear();
            for(int i=0,k=q.size();i<k;i++){
                TreeNode node = q.poll();
                list.add(node);
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
            }
        }
        return dfs(list,root);
    }
        private TreeNode dfs(List<TreeNode> list,TreeNode root){
            if(root==null)return null;
            if(list.contains(root)){
                return root;
            }
            TreeNode left = dfs(list,root.left);
            TreeNode right = dfs(list,root.right);
            if(left==null){
                return right;
            }else{
                return right==null?left:root;
            }
        }
}
