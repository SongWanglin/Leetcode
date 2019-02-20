/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        return helper(null, head);
    }
        private ListNode helper(ListNode head, ListNode newhead){
            if(newhead==null){
                return head;
            }
            ListNode tmp = newhead.next;
            newhead.next = head;
            return helper(newhead, tmp);
        }
}
