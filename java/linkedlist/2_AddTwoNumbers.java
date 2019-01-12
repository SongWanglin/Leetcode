/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0), head = temp;
        int addOne  = 0, digit = 0;
        while(l1!=null || l2!=null || addOne!=0){
            ListNode current = new ListNode(0);
            digit = ((l1==null)?0:l1.val) +((l2==null)?0:l2.val)+addOne;
            current.val = digit%10;
            addOne = digit/10;
            temp.next = current;
            temp = temp.next;
            l1 = (l1==null)? null: l1.next;
            l2 = (l2==null)? null: l2.next;
        }
        return head.next;
    }
}
