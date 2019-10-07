class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(nums, nums.length, visited, new LinkedList<Integer>(), res);
        return res;
    }
        private void dfs(int[] nums, int unvisited, boolean[] visited,
                        LinkedList<Integer> temp, List<List<Integer>> res){
            if(unvisited==0){
                res.add(new LinkedList<Integer>(temp));
            }
            for(int i = 0; i<nums.length; ++i){
                if(visited[i])
                    continue;
                visited[i] = true;
                temp.add(nums[i]);
                dfs(nums, unvisited-1, visited, temp, res);
                temp.pollLast();
                visited[i] = false;
            }
        }
}
