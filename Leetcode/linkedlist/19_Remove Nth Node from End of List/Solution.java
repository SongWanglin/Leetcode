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
        int[] N = {n};
        head = recursiveFindAndRemove(head, N);
        return head;
    }
        private ListNode recursiveFindAndRemove(ListNode head, int[] N){
            if(head==null) return head;
            head.next = recursiveFindAndRemove(head.next, N);
            N[0]--;
            return (N[0]==0)? head.next: head;
        }
}
