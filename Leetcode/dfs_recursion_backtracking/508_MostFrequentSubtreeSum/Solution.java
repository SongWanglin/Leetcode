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
    Map<Integer, Integer> map = new HashMap<>();
    int maxCount = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root);
        for(int num: map.keySet()){
            if(map.get(num)==maxCount)
                res.add(num);
        }
        return res.stream().mapToInt(i->i).toArray();
    }
        private int dfs(TreeNode root){
            if(root==null) return 0;
            root.val += dfs(root.left)+dfs(root.right);
            int occurrence = map.getOrDefault(root.val, 0)+1;
            maxCount = Math.max(maxCount, occurrence);
            map.put(root.val, occurrence);
            return root.val;
        }
}
