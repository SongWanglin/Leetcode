class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for(Character c: J.toCharArray()){
            set.add(c);
        }
        int res = 0;
        for(Character c: S.toCharArray()){
            if(set.contains(c))
                res++;
        }
        return res;
    }
}
