/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead ==null || pHead.next==null){
            return null;
        }
        ListNode slow = pHead;
        ListNode fast = pHead;
        do{
            slow = slow.next;
            fast = fast.next;
            if(fast.next!=null){
                fast = fast.next;
            }
        }while(fast!=null && fast!=slow);
        if(fast==null){
            return null;
        }
        ListNode res = pHead;
        while( res!=slow ){
            res = res.next;
            slow = slow.next;
        }
        return res;
    }
}
