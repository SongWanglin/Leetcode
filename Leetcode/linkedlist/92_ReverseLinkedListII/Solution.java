/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy, prev = dummy;
        for(int i = 0; i<=n; i++){
            ListNode next = cur.next;
            if( i == m ) head = prev;
            if( i >= m ) cur.next = prev;
            prev = cur;
            cur = next;
        }
        head.next.next = cur;
        head.next = prev;
        return dummy.next;
}
