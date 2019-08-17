/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        ListNode slow = head, fast = head, prev_slow = head;
        while(fast!=null && fast.next!=null){
            prev_slow = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode res = new TreeNode(slow.val);
        prev_slow.next = null;
        res.left = sortedListToBST(head);
        res.right = sortedListToBST(slow.next);
        return res;
    }
}
