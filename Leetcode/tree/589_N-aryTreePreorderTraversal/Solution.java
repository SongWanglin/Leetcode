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
     //recursive solution
    public List<Integer> preorder(Node root) {
        List<Integer> res = new LinkedList<>();
        preorderTraversal(res, root);
        return res;
    }
        private void preorderTraversal(List<Integer> res, Node root){
            if(root==null) return;
            res.add(root.val);
            for(Node child: root.children){
                preorderTraversal(res, child);
            }
        }
    // recursive solution 2
    /*/
    public List<Integer> preorder(Node root){
        List<Integer> res = new LinkedList<>();
        if(root == null)
            return res;
        res.add(root.val);
        for(Node child : root.children) {
            res.addAll(preorder(child));
        }
        return res;
    }/*/
    /*/ //iterative solution
    public List<Integer> preorder(Node root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) return res;
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.empty()) {
            root = stack.pop();
            res.add(root.val);
            for (int i = root.children.size() - 1; i >= 0; i--)
                stack.push(root.children.get(i));
        }
        return res;
    }/*/
}
