/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {
    HashMap<Integer, Node> dic = new HashMap<>();
    public Node cloneGraph(Node node) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        dfs(node, visited, graph);
        for(int k: graph.keySet()){
            dic.put( k, new Node(k, new LinkedList<Node>()) );
        }
        for(int k: graph.keySet()){
            for(int v: graph.get(k))
                dic.get(k).neighbors.add(dic.get(v));
        }
        return dic.get(node.val);
    }
        private void dfs(Node node, Set<Integer> visited,
                         Map<Integer, List<Integer>> graph){
            if(visited.contains(node.val))
                return;
            visited.add(node.val);
            graph.put(node.val, new LinkedList<Integer>());
            for(Node n: node.neighbors){
                graph.get(node.val).add(n.val);
                dfs(n, visited, graph);
            }
        }
}
