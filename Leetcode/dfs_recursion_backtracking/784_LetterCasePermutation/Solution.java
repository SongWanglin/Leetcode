class Solution {
    public List<String> letterCasePermutation(String S) {
        char[] chars = S.toCharArray();
        List<String> res = new LinkedList<String>();
        dfs(res, chars, 0);
        return res;
    }
        private void dfs(List<String> res, char[] chars, int index){
            if(index==chars.length){
                res.add(new String(chars));
                return;
            }
            dfs(res, chars, index+1);
            if(Character.isLetter(chars[index])){
                chars[index]^=32; //bit manipulation, change upper case to lower, lower case to upper
                dfs(res, chars, index+1);// if it is a letter, we try an additional separate path
            }
        }
}
