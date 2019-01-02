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
        if (head == null)
            return head;
        ListNode temp = head;
        while(temp.next!=null){
            if (temp.next.val != temp.val){
                temp = temp.next;
            } else{
                temp.next = temp.next.next;
            }
        }
        return head;
    }
}
