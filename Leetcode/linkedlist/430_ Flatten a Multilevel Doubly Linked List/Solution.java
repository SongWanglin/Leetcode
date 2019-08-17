/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
*/
class Solution {
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }
        private Node dfs(Node head){
            if(head==null) return head;
            if(head.child == null){
                if(head.next==null) return head;
                return dfs(head.next);
            }
            Node child = head.child;
            head.child = null;
            Node next = head.next;
            Node childtail = dfs(child);
            head.next = child;
            child.prev = head;
            if(next!=null){
                childtail.next = next;
                next.prev = childtail;
                return dfs(next);
            }
            return childtail;
        }
}

