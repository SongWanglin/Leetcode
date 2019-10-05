class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0, index = 0;
        while(res<g.length && index<s.length){
            if(s[index]>=g[res])
                res += 1;
            index += 1;
        }
        return res;
    }
}
