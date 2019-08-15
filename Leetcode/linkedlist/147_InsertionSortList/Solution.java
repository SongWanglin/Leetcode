/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode temp = dummy, curr = head, next = head;
        while(curr!=null){
            temp = dummy;
            next = curr.next;
            curr.next = null;
            while(temp.next!=null && curr.val>temp.next.val){
                temp = temp.next;
            }
            curr.next = temp.next;
            temp.next = curr;
            curr = next;
        }
        return dummy.next;
    }
}
