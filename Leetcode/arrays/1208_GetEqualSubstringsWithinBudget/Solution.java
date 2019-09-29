class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
      int i = 0, j = 0;
      while (i < s.length()) {
        maxCost -= Math.abs(s.charAt(i) - t.charAt(i++));
        if (maxCost < 0) maxCost += Math.abs(s.charAt(j) - t.charAt(j++));
      }
      return i - j;
    }
}
