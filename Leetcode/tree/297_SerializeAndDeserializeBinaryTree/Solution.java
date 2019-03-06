/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)
            return "{}";
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        StringBuilder str = new StringBuilder();
        queue.add(root);
        TreeNode temp = new TreeNode(-1);
        for(int i = 0; i<queue.size(); i++){
            temp = queue.get(i);
            if(temp == null){ continue; }
            queue.add(temp.left);
            queue.add(temp.right);
        }
        while(queue.get(queue.size()-1)==null){
            queue.remove(queue.size()-1);
        }
        str.append("{");
        str.append(root.val);
        for (int i = 1; i<queue.size(); i++){
            if(queue.get(i)==null){
                str.append(",#");
            } else{
                str.append(",");
                str.append(queue.get(i).val);
            }
        }
        str.append("}");
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("{}")){
            return null;
        }
        String[] input = data.substring(1, data.length()-1).split(",");
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        TreeNode root = new TreeNode(Integer.parseInt(input[0]));
        queue.add(root);
        int index = 0;  boolean isLeftChild = true;
        for (int i = 1; i<input.length; i++){
            if(!input[i].equals("#")){
                TreeNode temp = new TreeNode(Integer.parseInt(input[i]));
                if(isLeftChild){
                    queue.get(index).left = temp;
                } else{
                    queue.get(index).right = temp;
                }
                queue.add(temp);
            }
            if(!isLeftChild){
                index++;
            }
            isLeftChild = !isLeftChild;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
