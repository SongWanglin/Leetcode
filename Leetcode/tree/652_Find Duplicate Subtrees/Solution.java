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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        preorder(root, new HashMap<String, Integer>(), res);
        return res;
    }
        private String preorder(TreeNode root, Map<String, Integer> map, List<TreeNode> res) {
            if (root == null) return "#";
            String serial = root.val + "," + preorder(root.left, map, res)
                        + "," + preorder(root.right, map, res);
            if(map.getOrDefault(serial, 0)==1) res.add(root);
            map.put(serial, map.getOrDefault(serial, 0)+1);
            return serial;
        }
}
