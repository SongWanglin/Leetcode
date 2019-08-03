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
    public Node connect(Node root) {
        bfs(root);
        return root;
    }
       private void bfs(Node root) {
            Node current = root;
            while(current != null){
                Node dummyHead = new Node(-1);
                Node currentChild = dummyHead;
                while(current!=null){
                    if(current.left != null) { currentChild.next = current.left; currentChild = currentChild.next;}
                    if(current.right != null){ currentChild.next = current.right; currentChild = currentChild.next;}
                    current = current.next;
                }
                current = dummyHead.next;
            }
        }
}
