class Solution {
    public List<Integer> grayCode(int n) {
        HashSet<Integer> visited = new HashSet<>();
        LinkedList<Integer> res = new LinkedList<>();
        visited.add(0);
        res.add(0);
        dfs(n, res, visited);
        return res;
    }
    private boolean dfs(int n, LinkedList<Integer> res, HashSet<Integer> visited){
        if(visited.size()==(int)Math.pow(2, n))
            return true;
        int last = res.get(res.size()-1);
        for(int i = 0; i<n; ++i){
            int next = (last ^ (1<<i));
            if(!visited.contains(next) && next < (int)Math.pow(2, n)){
                visited.add(next);
                res.add(next);
                if(dfs(n, res, visited))
                    return true;
                res.pollLast();
                visited.remove(next);
            }
        }
        return false;
    }
}
