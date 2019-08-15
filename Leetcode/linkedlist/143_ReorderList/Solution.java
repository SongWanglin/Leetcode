/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        // concise recursive solution, but slow with O(N^2) time complexity
        // a more legit solution should be find mid-point->reverse second half->merge 2 parts
        if(head==null || head.next==null) return;
        if(head.next.next==null) return;
        ListNode temp = head, next = head.next;
        while(temp.next.next!=null){temp = temp.next;}
        head.next = temp.next;
        temp.next.next = next;
        temp.next = null;
        reorderList(next);
        /*/// deque solution
        if (head == null)
            return;
        ListNode temp = head;
        Deque<ListNode> Q = new LinkedList<ListNode>();
        while( temp.next!=null){
            temp = temp.next;
            Q.addLast(temp);
        }
        int idx = 0;
        temp = head;
        while(!Q.isEmpty()){
            temp.next = (idx%2 == 0) ? Q.pollLast(): Q.pollFirst();
            temp = temp.next;
            idx++;
        }
        temp.next = null;/*/
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        // concise recursive solution, but slow with O(N^2) time complexity
        // a more legit solution should be find mid-point->reverse second half->merge 2 parts
        if(head==null || head.next==null) return;
        if(head.next.next==null) return;
        ListNode temp = head, next = head.next;
        while(temp.next.next!=null){temp = temp.next;}
        head.next = temp.next;
        temp.next.next = next;
        temp.next = null;
        reorderList(next);
        /*/// deque solution
        if (head == null)
            return;
        ListNode temp = head;
        Deque<ListNode> Q = new LinkedList<ListNode>();
        while( temp.next!=null){
            temp = temp.next;
            Q.addLast(temp);
        }
        int idx = 0;
        temp = head;
        while(!Q.isEmpty()){
            temp.next = (idx%2 == 0) ? Q.pollLast(): Q.pollFirst();
            temp = temp.next;
            idx++;
        }
        temp.next = null;/*/
    }
}
