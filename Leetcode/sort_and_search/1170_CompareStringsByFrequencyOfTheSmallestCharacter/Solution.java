class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] f = new int[queries.length];
        int[] f2  = new int[words.length];
        for(int i = 0; i<queries.length; i++){
            f[i] = frequency(queries[i]);
        }
        for(int i = 0; i<words.length; i++){
            f2[i] = frequency(words[i]);
        }
        int[] res = new int[queries.length];
        for(int i = 0; i<res.length; i++){
            for(int j = 0; j<words.length; j++){
                if(f[i]<f2[j]){
                    res[i]+=1;
                }
            }
        }
        return res;
    }
        private int frequency(String s){
            char[] chs = s.toCharArray();
            Arrays.sort(chs);
            int res = 0;
            for(int i = 0; i<chs.length; i++){
                if(chs[i]!=chs[0]){
                    break;
                }
                res++;
            }
            return res;
        }
}
