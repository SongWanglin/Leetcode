class Solution {
    public int longestPalindrome(String s) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char temp = s.charAt(i);
            map.put(temp, map.getOrDefault(temp, 0)+1);
        }
        for(Character c: map.keySet()){
            res += (map.get(c)/2)*2;
        }
        return res < s.length() ? res+1: res;
    }
}
