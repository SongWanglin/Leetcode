import java.util.ArrayList;
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
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<Integer> path = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        dfs(root, target, path, res);
        return res;
    }
        private void dfs(TreeNode root, int sum, ArrayList<Integer> path,
                        ArrayList<ArrayList<Integer>> res){
            if(root==null){
                return;
            }
            path.add(new Integer(root.val));
            sum -= root.val;
            if(root.left==null && root.right==null){
                if(sum==0){
                    res.add(new ArrayList(path));
                }
                path.remove(path.size()-1);
                return;
            } else{
                dfs(root.left, sum, path, res);
                dfs(root.right, sum , path, res);
                path.remove(path.size()-1);
            }
        }
}
