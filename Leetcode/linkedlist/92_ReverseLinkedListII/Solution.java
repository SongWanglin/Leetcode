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
        ListNode cur = dummy, prev = dummy, next = dummy;
        for(int i = 0; i<=n; i++){
            next = cur.next;
            if( i == m ) head = prev;
            if( i >= m ) cur.next = prev;
            prev = cur;
            cur = next;
        }
        head.next.next = cur;
        head.next = prev;
        return dummy.next;
    }
    /*/ //recursive solution
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1); dummy.next = head;
        ListNode tail1 = dummy, head2 = dummy, head3 = dummy;
        for(int i = 0; i<m-1; i++){
            tail1 = tail1.next;
        }
        head2 = tail1.next; tail1.next = null;
        ListNode tail2 = head2;
        for(int i = m; i<n; i++){
            tail2 = tail2.next;
        }
        head3 = tail2.next; tail2.next = null;
        head2 = reverseList(head2);
        tail1.next = head2;
        while(head2.next!=null){ head2=head2.next; }
        head2.next = head3;
        return dummy.next;
    }
        private ListNode reverseList(ListNode head){
            if(head==null || head.next==null){
                return head;
            }
            ListNode res = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return res;
        }/*/
}
