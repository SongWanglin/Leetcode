/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root==null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> tmpList = new LinkedList<>();
            for(int i = 0; i<size; i++){
                Node current = queue.poll();
                tmpList.add(current.val);
                for(Node child: current.children) queue.offer(child);
            }
            res.add(tmpList);
        }
        return res;
    }
}

