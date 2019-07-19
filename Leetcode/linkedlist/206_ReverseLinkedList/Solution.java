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
       /* recursive solution */
        /*/
        if (head == null || head.next == null)
            return head;
        ListNode newList = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newList;/*/
        /* iterative solution */
        ListNode next = null;
        ListNode preHead = null;
        while(head!=null){
            next = head.next;
            head.next = preHead;
            preHead = head;
            head = next;
        }
        return preHead;
    }
}
