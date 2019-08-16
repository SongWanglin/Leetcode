/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists){
        return divideAndMerge(lists, 0, lists.length-1);
    }
        private ListNode divideAndMerge(ListNode[] lists,
                                int start, int end){
            if(start>end) return null;
            if(start==end) return lists[start];
            ListNode left = divideAndMerge(lists, start, (start+end)/2);
            ListNode right = divideAndMerge(lists, (start+end)/2+1, end);
            return mergeTwoLists(left, right);
        }
        private ListNode mergeTwoLists(ListNode l1, ListNode l2){
            if(l1==null) return l2;
            if(l2==null) return l1;
            if(l1.val < l2.val){
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else{
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }
    /*/// priority queue solution, memeory limit exceed
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        PriorityQueue<ListNode> pq = new PriorityQueue(new ListComparator());
        ListNode temp = dummy;
        for(ListNode node: lists){
            while(node!=null){
                pq.add(node); node = node.next;
            }
        }
        while(!pq.isEmpty()){
            temp.next = pq.poll();
            temp = temp.next;
        }
        return dummy.next;
    }

    private class ListComparator implements Comparator<ListNode>{
            public int compare(ListNode l1, ListNode l2) {
                return (l1.val < l2.val)? -1: 1;
            }
        } /*/
}
