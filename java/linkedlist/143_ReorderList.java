/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null)
            return;
        ListNode temp = head;
        Deque<ListNode> Q = new LinkedList<ListNode>();
        while( temp.next!=null){
            temp = temp.next;
            Q.addLast(temp);
        }
        int idx = 0;
        temp = head;
        while(!Q.isEmpty()){
            temp.next = (idx%2 == 0) ? Q.pollLast(): Q.pollFirst();
            temp = temp.next;
            idx++;
        }
        temp.next = null;
    }
}
