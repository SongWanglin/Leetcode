/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode curr = dummy, next = dummy.next;
        while(next!=null){
            while(next.next!=null && next.val==next.next.val){
                next = next.next;
            }
            if(curr.next == next){
                curr = curr.next;
            } else{
                curr.next = next.next;
            }
            next = next.next;
        }
        return dummy.next;
    }
}
