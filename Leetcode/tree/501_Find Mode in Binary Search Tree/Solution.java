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
    public int[] findMode(TreeNode root) {
        if(root==null) return new int[0];
        Stack<TreeNode> stk = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeMap<Integer, List<Integer>> freq = new TreeMap<>();
        TreeNode p = root;
        while( p!=null || !stk.isEmpty()){
            while(p!=null){
                stk.push(p);
                p = p.left;
            }
            p = stk.pop();
            map.put(p.val, map.getOrDefault(p.val, 0)+1);
            p = p.right;
        }
        for( int num: map.keySet()){
            int key = map.get(num);
            if(!freq.containsKey(key)){
                freq.put(key, new ArrayList<Integer>());
            }
            freq.get(key).add(num);
        }
        Map.Entry<Integer, List<Integer>> entry = freq.pollLastEntry();
        int[] res = new int[entry.getValue().size()];
        for(int i = 0; i<entry.getValue().size(); i++){
            res[i] = entry.getValue().get(i);
        }
        return res;
    }
}
