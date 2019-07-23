/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    /*/ do it with list reverse
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
        }/*/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addOne = 0, digit = 0;

        ListNode res = new ListNode(0), temp = res;
        Stack<ListNode> s1 = new Stack<>(); ListNode p1 = l1;
        while(p1!=null){ s1.push(p1); p1 = p1.next; }
        Stack<ListNode> s2 = new Stack<>(); ListNode p2 = l2;
        while(p2!=null){ s2.push(p2); p2 = p2.next; }
        Stack<ListNode> resultStack = new Stack<>();

        while(!s1.isEmpty() || !s2.isEmpty() || addOne!=0){
            digit = ( (s1.isEmpty())? 0: s1.pop().val ) + ( (s2.isEmpty())?0: s2.pop().val ) + addOne;
            addOne = digit/10;
            ListNode current = new ListNode(digit%10);
            resultStack.push(current);
        }

        while(!resultStack.isEmpty()){
            temp.next = resultStack.pop();
            temp = temp.next;
        }
        return res.next;
    }
}
