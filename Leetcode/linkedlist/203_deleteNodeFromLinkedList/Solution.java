/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //if (head!=null&& head.next==null)
            //if (head.val == val )
            //    return null;
          //  else
        //        return head;
        ListNode temp = head;
        if (temp == null)
            return null;
        while(temp.next!=null){
            if (temp.val!=val && temp.next.val != val)
                temp = temp.next;
            else if(temp.val == val){
                temp.val = temp.next.val;
                temp.next = temp.next.next;
            }
            else if(temp.next.val == val){
                temp.next = temp.next.next;
            }
        }
        if (temp.val == val && temp.next ==null)
            return null;
        return head;
    }
}
