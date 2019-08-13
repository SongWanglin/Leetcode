/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int addOne = 0, sum = 0, length1 = 0, length2 = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        ListNode p1 = l1, p2 = l2, res = new ListNode(0);
        while(p1!=null){
            deque.addFirst(p1.val);
            p1 = p1.next;
            length1++;
        }
        while(p2!=null){
            deque.addLast(p2.val);
            p2 = p2.next;
            length2++;
        }
        while(!deque.isEmpty() || addOne!=0){
            sum = ((length1>0)? deque.pollFirst():0) + ((length2>0)? deque.pollLast():0) +res.val;
            res.val = sum%10;
            addOne = sum/10;
            ListNode pre = new ListNode(addOne);
            pre.next = res;
            res = pre;
            length1--; length2--;
        }
        return (res.val==1)? res: res.next;
    }
    /*/// solution with list reversing
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        int addOne = 0, sum = 0;
        ListNode dummyHead = new ListNode(-1), temp = dummyHead;
        while( l1!=null || l2!=null || addOne!=0){
            sum = ((l1==null)?0:l1.val)+((l2==null)?0:l2.val)+addOne;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            addOne = sum/10;
            l1 = (l1==null)? l1: l1.next;
            l2 = (l2==null)? l2: l2.next;
        }
        ListNode res = reverseList(dummyHead.next);
        return res;
    }
        private ListNode reverseList(ListNode head){
            if(head==null || head.next==null){
                return head;
            }
            ListNode res = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return res;
        }/*/
}
