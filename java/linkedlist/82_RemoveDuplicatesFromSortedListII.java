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
        head = subHead(head);
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast.next = subHead(fast.next);
            if (fast.next!=null && fast.next.val !=fast.val){
                fast = fast.next;
            }
        }
        return head;
    }
        private ListNode subHead(ListNode head){
            if (head == null || head.next==null){
                return head;
            }
            while(head !=null&& head.next!=null&&head.val == head.next.val){
                head = skipDuplicateHead(head);
            }
            return head;
        }
        private ListNode skipDuplicateHead(ListNode head){
            if (head == null || head.next == null ||head.next.val!=head.val){
                return head;
            }
            while(head !=null&& head.next!=null&&head.val == head.next.val){
                head = head.next;
            }
            return head.next;
        }
}

/* Recursive Implementation */
/*/
public ListNode deleteDuplicates(ListNode head) {
    if (head == null) return null;

    if (head.next != null && head.val == head.next.val) {
        while (head.next != null && head.val == head.next.val) {
            head = head.next;
        }
        return deleteDuplicates(head.next);
    } else {
        head.next = deleteDuplicates(head.next);
    }
    return head;
}
/*/
