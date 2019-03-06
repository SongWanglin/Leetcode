public class Solution {
    /**
     * @param s1: the 1st string
     * @param s2: the 2nd string
     * @return: uncommon characters of given strings
     */
    public String concatenetedString(String s1, String s2) {
        // write your code here
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for(int i=0; i<s1.length(); i++){
            set1.add(s1.charAt(i));
        }
        for(int i=0; i<s2.length(); i++){
            set2.add(s2.charAt(i));
        }
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s1.length(); i++){
            if (!set2.contains(s1.charAt(i)) ){
                res.append(s1.charAt(i));
            }
        }
        for(int i=0; i<s2.length(); i++){
            if(!set1.contains(s2.charAt(i)) ){
                res.append(s2.charAt(i));
            }
        }
        return res.toString();
    }
}
