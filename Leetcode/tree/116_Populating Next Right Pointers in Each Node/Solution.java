/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root){
        if(root==null) return null;
        bfs(root.left, root.right);
        return root;
    }
        private void bfs(Node node1, Node node2){
            if(node1==null) return;
            node1.next = node2;
            bfs(node1.left, node1.right);
            bfs(node1.right, node2.left);
            bfs(node2.left, node2.right);
        }
    /*/ // simple bfs solution
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size= queue.size();
            for(int i = 0; i<size; ++i){
                Node temp = queue.poll();
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
                if(i==size-1){
                    temp.next = null;
                }else{
                    temp.next = queue.peek();
                }
            }
        }
        return root;
    }/*/
}
