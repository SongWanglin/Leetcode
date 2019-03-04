/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null)
            return null;
        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> stk = new Stack<>();
        TreeNode tmp = pRootOfTree;
        while(tmp!=null || !stk.isEmpty()){
            while(tmp!=null){
                stk.push(tmp);
                tmp = tmp.left;
            }
            tmp = stk.pop();
            q.add(tmp);
            tmp = tmp.right;
        }
        TreeNode res = q.poll();
        res.left = null;
        tmp = res;
        while(tmp!=null && !q.isEmpty()){
            TreeNode tmp2 = q.poll();
            tmp.right = tmp2;
            tmp2.left = tmp;
            tmp = tmp2;
        }
        return res;
    }
}
