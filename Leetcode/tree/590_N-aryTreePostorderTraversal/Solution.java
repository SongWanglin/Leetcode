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
    /*/ //recursive solution
    public List<Integer> postorder(Node root) {
        List<Integer> res = new LinkedList<>();
        preorderTraversal(res, root);
        return res;
    }
        private void preorderTraversal(List<Integer> res, Node root){
            if(root==null) return;
            for(Node child: root.children){
                preorderTraversal(res, child);
            }
            res.add(root.val);
        }/*/
    // recursive solution2
    public List<Integer> postorder(Node root){
        List<Integer> res = new LinkedList<>();
        if(root == null)
            return res;
        for(Node child : root.children) {
            res.addAll(postorder(child));
        }
        res.add(root.val);
        return res;
    }
    /*/ //iterative solution
    public List<Integer> postorder(Node root){
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return res;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node temp = stack.pop();
            res.add(0, temp.val);
            for (int i = 0; i < temp.children.size(); i++)
                stack.push(temp.children.get(i));
        }
        return res;
    }/*/
}
