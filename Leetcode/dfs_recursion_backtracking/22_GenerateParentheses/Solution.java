class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<>();
        dfs(n, n, "", res);
        return res;
    }
    private void dfs(int left, int right,
                     String temp, List<String> res){
        if(left==0 && right==0){
            res.add(temp);
            return;
        }
        if(left > 0)
            dfs(left-1, right, temp+"(", res);
        if(left<right)
            dfs(left, right-1, temp+")", res);
    }
}
