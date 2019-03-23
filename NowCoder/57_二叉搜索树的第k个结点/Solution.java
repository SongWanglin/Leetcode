/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
import java.util.*;
public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot==null){
            return null;
        }
        ArrayList<TreeNode> res = new ArrayList<>();
        TreeNode curNode = pRoot;
        Stack<TreeNode> stk = new Stack<>();
        while(curNode!=null || stk.size()!=0){
            while(curNode!=null){
                stk.push(curNode);
                curNode = curNode.left;
            }
            curNode = stk.pop();
            res.add(curNode);
            curNode = curNode.right;
        }
        if(k>res.size()){
            return null;
        }
        for(int i = 0; i<k; i++){
            curNode = res.get(i);
        }
        return curNode;
    }
}
