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
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int res = 0;
        for(Node child: root.children)  res = Math.max(res, maxDepth(child));
        return 1+res;
        /*/
        if(root==null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int res = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i<size; i++){
                Node current = queue.poll();
                for(Node child: current.children) queue.offer(child);
            }
            res++;
        }
        return res;/*/
    }
}
