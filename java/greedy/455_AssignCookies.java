class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); Arrays.sort(s);
        int res = 0, n_child = 0, n_cookie = 0;
        while (n_child<g.length && n_cookie<s.length){
            if (s[n_cookie]>=g[n_child]){
                n_child++;
                res+=1;
            }
            n_cookie++;
        }
        return res;
    }
}
