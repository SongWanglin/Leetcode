class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new LinkedList<String>();
        char[] chars = S.toCharArray();
        dfs(res, chars, 0);
        return res;
    }
        private void dfs(List<String> res, char[] chars, int index){
            if(index==chars.length){
                res.add(new String(chars));
                return;
            }
            if (Character.isLetter(chars[index])){
                chars[index]^=32;
                dfs(res, chars, index+1);
                chars[index]^=32;
                dfs(res, chars, index+1);
            } else{
                dfs(res, chars, index+1);
            }
        }
}
