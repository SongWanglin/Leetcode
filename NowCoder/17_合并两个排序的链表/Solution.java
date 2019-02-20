/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode dummyHead = new ListNode(-1), tmp = dummyHead;
        while (list1!=null && list2!=null){
            if(list1.val<=list2.val){
                tmp.next = list1;
                tmp = tmp.next;
                list1 = list1.next;
            } else{
                tmp.next = list2;
                tmp = tmp.next;
                list2 = list2.next;
            }
        }
        if(list1!=null){
            tmp.next = list1;
        }
        if(list2!=null){
            tmp.next = list2;
        }
        return dummyHead.next;
    }
}
