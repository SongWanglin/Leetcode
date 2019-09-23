class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        boolean[] visited = new boolean[n];
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i<n; ++i) graph.add(new ArrayList<Integer>());
        for(int i = 0; i<pairs.size(); ++i){
            graph.get(pairs.get(i).get(1)).add(pairs.get(i).get(0));
            graph.get(pairs.get(i).get(0)).add(pairs.get(i).get(1));
        }
        List<Character> res = s.chars()                 // IntStream
                                .mapToObj(e -> (char)e)     // Stream<Character>
                                .collect(Collectors.toList());
        for(int i = 0; i<n; ++i){
            if(visited[i])
                continue;
            List<Integer> component = new ArrayList<Integer>();
            dfs(i, component, visited, graph);
            Collections.sort(component);
            List<Character> chars = new ArrayList<>();
            for(int num: component)
                chars.add(res.get(num));
            Collections.sort(chars);
            for(int j = 0; j<component.size(); ++j)
                res.set(component.get(j), chars.get(j));
        }
        StringBuilder b = new StringBuilder();
        res.forEach(b::append);
        return b.toString();
    }
    private void dfs(int src, List<Integer> component,
                     boolean[] visited, List<List<Integer>> graph){
        visited[src] = true;
        component.add(src);
        for(int dest: graph.get(src)){
            if(!visited[dest])
                dfs(dest, component, visited, graph);
        }
    }
}
