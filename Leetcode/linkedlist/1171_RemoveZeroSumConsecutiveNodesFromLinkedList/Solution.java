/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head==null) return null;
        head.next = removeZeroSumSublists(head.next);
        ListNode temp = head;
        int sum = 0;
        while(temp!=null){
            sum += temp.val;
            temp = temp.next;
            if(sum==0){
                return temp;
            }
        }
        return head;
    }
}
