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
        int addOne = 0, digit = 0;
        ListNode res = new ListNode(0), temp = res;
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        while( l1!=null || l2!=null || addOne!=0){
            digit = ((l1!=null)? l1.val:0) + ((l2!=null)? l2.val:0) + addOne;
            addOne = digit/10;
            ListNode current = new ListNode(digit%10);
            temp.next = current;
            temp = temp.next;
            l1 = (l1==null)? l1: l1.next;
            l2 = (l2==null)? l2: l2.next;
        }
        return reverseList(res.next);
    }
        private ListNode reverseList(ListNode head){
            if(head==null || head.next==null){
                return head;
            }
            ListNode newList = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return newList;
        }
}
