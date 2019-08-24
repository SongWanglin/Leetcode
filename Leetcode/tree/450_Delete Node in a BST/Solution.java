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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if( root.val == key ) root = mergeBST(root.left, root.right);
        else if( root.val>key ){
            root.left = deleteNode(root.left, key);
        } else{
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
        private TreeNode mergeBST(TreeNode a, TreeNode b){
            if(a==null) return b;
            if(b==null) return a;
            if( a.val>b.val ){
                TreeNode temp = b.right;
                b.right = null;
                a.left = mergeBST(a.left, b);
                a = mergeBST(a, temp);
                return a;
            } else{
                TreeNode temp = a.right;
                a.right = null;
                b.left = mergeBST(b.left, a);
                b = mergeBST(b, temp);
                return b;
            }
        }
}
