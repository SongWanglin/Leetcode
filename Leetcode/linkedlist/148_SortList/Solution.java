/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if( head==null || head.next==null)
            return head;
        if( head.next.next==null){
            if(head.val > head.next.val){
                ListNode newHead = head.next;
                head.next.next = head; head.next = null;
                return newHead;
            } else{
                return head;
            }
        }
        ListNode slow = head, fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        head = sortList(head);
        slow = sortList(fast);
        ListNode dummy= new ListNode(-1), temp = dummy;
        while(head!=null && slow!=null){
            if(head.val > slow.val){
                temp.next = slow; slow = slow.next; temp = temp.next;
            }else{
                temp.next = head; head = head.next; temp = temp.next;
            }
        }
        if(head!=null) temp.next = head;
        if(slow!=null) temp.next = slow;
        return dummy.next;
    }
}
