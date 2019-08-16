/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {/*/
    //iterative solution
    public boolean findTarget(TreeNode root, int k) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Stack<TreeNode> stk = new Stack<>();
        TreeNode temp = root;
        while( temp!=null || !stk.isEmpty() ){
            while(temp!=null){
                stk.push(temp);
                temp = temp.left;
            }
            temp = stk.pop();
            if(map.containsKey(k-temp.val)){
                return true;
            }
            map.put(temp.val, temp);
            temp = temp.right;
        }
        return false;
    }/*/
    // recursive
    public boolean findTarget(TreeNode root, int k){
        HashSet<Integer> set = new HashSet<>();
        return dfs(set, root, k);
    }
        private boolean dfs(HashSet<Integer> set,
                            TreeNode root, int k){
            if(root==null) return false;
            if(set.contains(k-root.val)) return true;
            set.add(root.val);
            return dfs(set, root.left, k) || dfs(set, root.right, k);
        }
}
