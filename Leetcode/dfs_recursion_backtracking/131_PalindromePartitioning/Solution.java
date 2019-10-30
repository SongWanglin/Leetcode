class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new LinkedList<>();
        LinkedList<String> temp = new LinkedList<String>();
        dfs(res, temp, s, 0);
        return res;
    }
    private void dfs(List<List<String>> res, LinkedList<String> temp,
                     String s, int start){
        if(s.length()==start){
            res.add(new LinkedList<String>(temp));
            return;
        }
        for(int i = start; i<s.length(); ++i){
            String sub = s.substring(start, i+1);
            if(isPalindrome(sub)){
                temp.add(new String(sub));
                dfs(res, temp, s, i+1);
                temp.pollLast();
            }
        }
    }
    private boolean isPalindrome(String s){
        int start = 0, end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start += 1;
            end -= 1;
        }
        return (end==-1)? false: true;
    }
}
