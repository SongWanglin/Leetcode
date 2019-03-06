/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /* 2 passes */
        /*/
        ListNode pre = new ListNode(-1);
        pre.next = head;
        int len = 0;
        ListNode temp = pre;
        while(temp.next!=null){
            temp = temp.next;
            len++;
        }
        temp = pre;
        while (len-n>0){
            len--;
            temp = temp.next;
        }
        ListNode temp2 = temp.next;
        temp.next = temp2.next;
        temp2.next = null;
        return pre.next;
        /*/
        /* one pass */
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode fast = pre, slow = pre;
        for (int i = 0; i<=n; i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return pre.next;
    }
}
