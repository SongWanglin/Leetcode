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
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead==null){
            return null;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = pHead;
        ListNode search = pHead, pre = dummyHead;
        while(search!=null){
            while(search.next!=null && search.val==search.next.val){
                search = search.next;
            }
            if(pre.next==search){
                pre = pre.next;
            } else{
                pre.next = search.next;
            }
            search = search.next;
        }
        return dummyHead.next;
    }
}
