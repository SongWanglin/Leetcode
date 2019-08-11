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
        ListNode dummyHead = new ListNode(-1), temp = dummyHead;
        int addOne = 0, val = 0, sum = 0;
        while(addOne!=0 || l1!=null || l2!=null){
            sum = ((l1==null)?0:l1.val) + ((l2==null)?0:l2.val)+addOne;
            val = sum%10;
            addOne = sum/10;
            temp.next = new ListNode(val);
            temp = temp.next;
            l1 = (l1==null)? l1: l1.next;
            l2 = (l2==null)? l2: l2.next;
        }
        return dummyHead.next;
    }
}
