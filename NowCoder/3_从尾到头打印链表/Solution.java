/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(listNode, res);
        return res;
    }
        private void helper(ListNode listNode, ArrayList<Integer> res){
            if(listNode == null){
                return;
            }
            helper(listNode.next, res);
            res.add(new Integer(listNode.val));
        }
}
