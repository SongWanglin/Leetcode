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
    // do it with binary search
    /*/
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();
        ListNode p = head;
        while(p!=null){ nums.add(p.val); p = p.next; }
        if( nums.size()==0) return null;
        TreeNode root = subtree(nums, 0, nums.size()-1);
        return root;
    }
        private TreeNode subtree(ArrayList<Integer> nums, int low, int high){
            if(low>high){
                return null;
            }
            int mid = (low+high)/2;
            TreeNode root = new TreeNode(nums.get(mid));
            root.left = subtree(nums, low, mid-1);
            root.right = subtree(nums, mid+1, high);
            return root;
        }
    /*/
    public TreeNode sortedListToBST(ListNode head){
        if(head == null) return null;
        return recursiveBST(head, null);
    }
        private TreeNode recursiveBST(ListNode head, ListNode tail){
            if( head==null || head == tail){
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;
            while(fast.next!=tail && fast.next.next!=tail){
                slow = slow.next;
                fast = fast.next.next;
            }
            TreeNode root = new TreeNode(slow.val);
            root.left = recursiveBST(head, slow);
            root.right = recursiveBST(slow.next, tail);
            return root;
        }
}
