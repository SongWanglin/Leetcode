class Solution {
    static final HashMap<Integer, String> map = new HashMap<Integer, String>(){{
        put(2, "abc"); put(3, "def"); put(4, "ghi"); put(5, "jkl");
        put(6, "mno"); put(7, "pqrs"); put(8, "tuv"); put(9, "wxyz");
    }};
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<>();
        dfs(res, digits, "", 0);
        return res;
    }
    private void dfs(LinkedList<String> res, String digits,
                     String temp, int index){
        if(index>=digits.length()){
            if(!temp.isEmpty()){
                res.add(temp);
            }
            return;
        }
        int k = Integer.parseInt( Character.toString(digits.charAt(index)) );
        for(Character c: map.get(k).toCharArray()){
            dfs(res, digits, temp+c, index+1);
        }
    }
}
