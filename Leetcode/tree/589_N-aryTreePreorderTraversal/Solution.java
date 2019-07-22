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
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }
        private void dfs(Node root, List<Integer> res){
            if(root==null) return;
            res.add(root.val);
            if(root.children == null) return;
            for(Node n: root.children){
                dfs(n, res);
            }
        }
}

