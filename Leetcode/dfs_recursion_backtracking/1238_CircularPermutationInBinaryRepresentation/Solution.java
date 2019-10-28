class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        LinkedList<Integer> res = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        visited.add(start);
        res.add(start);
        dfs(res, visited, n);
        return res;
    }
    private boolean dfs(LinkedList<Integer> res, HashSet<Integer> visited,
                       int n){
        int last = res.get(res.size()-1);
        if( visited.size()==(int)Math.pow(2, n)){
            int x = last ^ res.get(0);
            return (x&(x-1))==0;
        }
        for(int i = 0; i<16; ++i){
            int next = (last ^ (1<<i));
            if(!visited.contains(next) && next<(int)Math.pow(2, n)){
                visited.add(next);
                res.add(next);
                if(dfs(res, visited, n))
                    return true;
                visited.remove(next);
                res.pollLast();
            }
        }
        return false;
    }
}
