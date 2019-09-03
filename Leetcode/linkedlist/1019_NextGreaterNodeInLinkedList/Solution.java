/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stk = new Stack<>();
        ListNode temp = head;
        List<Integer> nums = new ArrayList<>();
        while(temp!=null){
            nums.add(temp.val);
            temp = temp.next;
        }
        int[] res = new int[nums.size()];
        for(int i = 0; i<nums.size(); ++i){
            while(!stk.isEmpty() && nums.get(stk.peek())<nums.get(i)){
                int index = stk.pop();
                res[index] = nums.get(i);
            }
            stk.push(i);
        }
        return res;
    }
}
