/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyHead1 = new ListNode(-1), dummyHead2 = new ListNode(-1);
        ListNode cur1 = dummyHead1, cur2 = dummyHead2;
        while(head!=null){
            if(head.val<x){
                cur1.next = new ListNode(head.val);
                cur1 = cur1.next;
            } else{
                cur2.next = new ListNode(head.val);
                cur2 = cur2.next;
            }
            head = head.next;
        }
        cur1.next= dummyHead2.next;
        return dummyHead1.next;
    }
}
