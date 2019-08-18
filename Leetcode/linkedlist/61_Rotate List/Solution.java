/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // stupid iterative solution, tedious but it works out
        if(k==0 || head==null || head.next==null) return head;
        // find list length and the actual rotation number
        ListNode res = head, temp = head, prev = head;
        int size = 0;
        while(temp!=null) { temp = temp.next; size++; }
        k = size - k%size;
        if(k==size) return head;
        // find the new head and tail
        for(int i = 0; i<k; i++){
            prev = res;
            res = res.next;
        }
        prev.next = null; temp = res;
        // connect two parts
        while(temp!=null && temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        return res;
    }
}
