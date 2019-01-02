/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       /* iterative solution */
        /*/
        if (head == null || head.next == null)
            return head;
        ListNode temp = head.next;
        ListNode newhead = temp;
        head.next = temp.next;
        newhead.next = head;
        while(head.next!=null){
            newhead = head.next;
            head.next = newhead.next;
            newhead.next = temp;
            temp = newhead;
        }
        return newhead;
        /*/
        return reverse(head, null);
    }
    /*recursive*/
    public ListNode reverse(ListNode head, ListNode temp){
        if (head == null)
            return temp;
        ListNode newhead = head.next;
        head.next = temp;
        return reverse(newhead, head);
    }
}
