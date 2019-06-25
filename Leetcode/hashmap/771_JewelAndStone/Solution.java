class Solution {   
    public int numJewelsInStones(String J, String S) {       
        /* long solution using hashset */               
        HashSet<Character> jewel = new HashSet<Character>();       
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();       
        for (int i = 0; i<j.length; i++){
            jewel.add(j[i]);
        }       
        int res = 0;       
        for(int i = 0; i<s.length; i++){           
            if(jewel.contains(s[i])){
                res++;           
            }       
        }
        return res;
}

