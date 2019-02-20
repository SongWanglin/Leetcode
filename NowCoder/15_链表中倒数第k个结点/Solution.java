/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        int len = length(head);
        if(k>len){
            return null;
        }
        while(k<len && head!=null){
            head = head.next;
            k++;
        }
        return head;
    }
        private int length (ListNode head){
            if(head == null){
                return 0;
            }
            return 1 + length(head.next);
        }
}
