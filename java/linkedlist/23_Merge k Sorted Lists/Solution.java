/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)
            return null;
        return divide(lists, 0, lists.length-1);
    }
        private ListNode divide(ListNode[] lists, int start, int end){
            if(start==end) return lists[start];
            int mid = (start+end)/2;
            ListNode left = divide(lists, start, mid);
            ListNode right = divide(lists, mid+1, end);
            return mergeTwoLists(left, right);
        }
        private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1==null) return l2;
            if(l2==null) return l1;
            if(l1.val <=l2.val){
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            }else{
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }
}
