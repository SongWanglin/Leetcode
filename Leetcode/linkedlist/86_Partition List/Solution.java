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
        ListNode dummy1 = new ListNode(-1), dummy2 = new ListNode(-1),
            smallTail = dummy1, greatTail = dummy2;
        while(head!=null){
            if(head.val < x){
                smallTail.next = head;
                smallTail = smallTail.next;
            }else{
                greatTail.next = head;
                greatTail = greatTail.next;
            }
            head = head.next;
        }
        greatTail.next = null;
        smallTail.next = dummy2.next;
        return dummy1.next;
    }
}
