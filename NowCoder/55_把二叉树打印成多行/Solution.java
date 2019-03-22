import java.util.ArrayList;


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
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> currentLevel = new ArrayList<>();
    ArrayList<ArrayList<Integer> > Print(TreeNode root) {
        if (root == null)
            return res;
        Queue<TreeNode> curlevel = new LinkedList<TreeNode>();
        curlevel.add(root);
        bfs(curlevel);
        return res;
    }
        private void bfs(Queue<TreeNode> current){
            Queue<TreeNode> nextlevel = new LinkedList<TreeNode>();
            while(!current.isEmpty()){
                TreeNode temp = current.poll();
                if(temp.left!=null) nextlevel.add(temp.left);
                if(temp.right!=null) nextlevel.add(temp.right);
                currentLevel.add(temp.val);
                if (current.isEmpty()){
                    res.add(currentLevel);
                    currentLevel = new ArrayList();
                    bfs(nextlevel);
                }
            }
        }
}
