/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        /*///original solution
        if(head==null) return head;
        ListNode oddHead = new ListNode(-1), temp = head, tail = temp, odd = oddHead;
        while(temp!=null){
            odd.next = temp.next;
            odd = odd.next;
            if(temp.next!=null){
                temp.next = temp.next.next;
                temp = temp.next;
            }else{
                temp.next = null;
            }
            temp = temp.next;
        }
        temp = head;
        while( temp.next!=null){ temp = temp.next; }
        temp.next = oddHead.next;
        return head;/*/
        if(head==null) return null;
        ListNode odd = head, evenHead = head.next, even = evenHead;
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
