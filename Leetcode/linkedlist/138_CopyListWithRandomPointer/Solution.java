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
class Solution {
    public Node copyRandomList(Node phead) {
        if(phead==null) return null;
        Node res = new Node(phead.val);
        Map<Node, Node> map = new HashMap<>();
        Node temp = phead;
        temp = phead;
        Node temp2 = res;
        while(temp!=null){
            map.put(temp, temp2);
            temp = temp.next;
            temp2.next = (temp==null)? null: new Node(temp.val);
            temp2 = (temp2.next==null)? temp2: temp2.next;
        }
        temp = phead;
        temp2 = res;
        while(temp!=null){
            Node random = map.get(temp.random);
            temp2.random = random;
            temp = temp.next;
            temp2 = temp2.next;
        }
        return res;
    }
}
