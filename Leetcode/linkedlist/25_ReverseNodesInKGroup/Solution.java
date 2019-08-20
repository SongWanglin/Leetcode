/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        /*/ListNode curr = head;
        int count = 0;
        while (curr != null && count != k) { // find the k+1 node
            curr = curr.next;
            count++;
        }
        if (count == k) { // if k+1 node is found
            curr = reverseKGroup(curr, k); // reverse list with k+1 node as head
            // head - head-pointer to direct part,
            // curr - head-pointer to reversed part;
            while (count -- >0) { // reverse current k-group:
                ListNode tmp = head.next; // tmp - next head in direct part
                head.next = curr; // preappending "direct" head to the reversed list
                curr = head; // move head of reversed part to a new node
                head = tmp; // move "direct" head to the next node in direct part
            }
            head = curr;
        }
        return head;
    }/*/
        if(head==null || head.next==null) return head;
        ListNode tail = head, nextHead = head;
        int i = 1;
        while(nextHead!=null && i<=k){
            tail = nextHead;
            nextHead = nextHead.next;
            i++;
        }
        if(i<=k) return head;
        tail.next = null;
        //head = reverseList(head);
        ListNode next = null, current = head, prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        tail.next = reverseKGroup(nextHead, k);
        return head;
    }
        private ListNode reverseList(ListNode head){
            if(head==null || head.next==null ) return head;
            ListNode res = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return res;
        }
}
