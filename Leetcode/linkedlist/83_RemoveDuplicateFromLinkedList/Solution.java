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
        /*A more concise solution be low*/
        /*/
        ListNode list = head;

         while(list != null) {
             if (list.next == null) {
                 break;
             }
             if (list.val == list.next.val) {
                 list.next = list.next.next;
             } else {
                 list = list.next;
             }
         }

         return head;
         /*/
    }
}
