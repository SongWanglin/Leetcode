/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
import java.util.Hashtable;
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Hashtable<Node, Node> random_target= new Hashtable<>();
        Node tmp = head;
        while(tmp!=null){
            random_target.put(tmp, new Node(tmp.val, tmp.next, tmp.random));
            tmp = tmp.next;
        }
        Node res = random_target.get(head);
        tmp = head;
        Node tmp2 = res;
        while(tmp!=null){
            tmp2.next = (tmp.next==null)?null:random_target.get(tmp.next);
            tmp2.random = (tmp.random==null)? null: random_target.get(tmp.random);
            tmp = tmp.next;
            tmp2 = tmp2.next;
        }
        return res;
    }
}
