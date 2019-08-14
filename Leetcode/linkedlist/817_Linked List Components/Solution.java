/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: G){
            set.add(num);
        }
        ListNode temp = head;
        int res = 0;
        while(temp!=null){
            if(set.contains(temp.val) && (temp.next==null || !set.contains(temp.next.val)))
                res++;
            temp = temp.next;
        }
        return res;
    }
}
