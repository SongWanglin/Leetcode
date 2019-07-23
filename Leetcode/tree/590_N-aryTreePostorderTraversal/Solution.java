/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new LinkedList<>();
        dfs(res, root);
        return res;
    }
        private void dfs(List<Integer> res, Node root){
            if(root==null){
                return;
            }
            for(Node n: root.children){
                dfs(res, n);
            }
            res.add(root.val);
        }
}
