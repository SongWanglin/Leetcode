/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode mid = head, end = head;
        while(end!=null && end.next!=null){
            mid = mid.next;
            end = end.next.next;
        }
        return mid;
    }
}
