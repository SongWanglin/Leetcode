/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next==null)
            return true;
        Stack<Integer> res = new Stack<Integer>();
        ListNode slow = head, fast = head;
        while (fast!=null && fast.next!=null){
            res.push(slow.val);
            slow = slow.next;  fast = fast.next.next;
        }
        if(fast!=null)
            slow=slow.next;     //check if it is odd length mid point
        while(slow!=null){
            if (slow.val!=res.pop())
                return false;
            slow = slow.next;
        }
        return true;
    }
}
