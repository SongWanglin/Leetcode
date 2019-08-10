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
        /*/ // recursive
        if(head==null || head.next==null) return head;
        ListNode res = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return res;/*/
        ListNode res = null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = res;
            res = head;
            head = next;
        }
        return res;
    }
}
