import java.util.ArrayList;
import java.util.LinkedList;
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
public class Solution {
    ArrayList<Integer> res = new ArrayList<>();
    LinkedList<TreeNode> cur_level = new LinkedList<TreeNode>();
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null)
            return res;
        cur_level.add(root);
        LinkedList<TreeNode> next_level = new LinkedList<>();
        bfs(cur_level, next_level);
        return res;
    }
        private void bfs(LinkedList<TreeNode> cur_level,
                         LinkedList<TreeNode> next_level){
            while(!cur_level.isEmpty()){
                TreeNode tmp = cur_level.poll();
                if(tmp.left!= null) next_level.add(tmp.left);
                if(tmp.right!=null) next_level.add(tmp.right);
                res.add(tmp.val);
                if(cur_level.isEmpty()){
                    cur_level = next_level;
                    next_level = new LinkedList<TreeNode>();
                    bfs(cur_level, next_level);
                }
            }
        }
}
