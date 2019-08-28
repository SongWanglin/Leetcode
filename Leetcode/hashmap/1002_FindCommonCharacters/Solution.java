class Solution {
    public List<String> commonChars(String[] A) {
        List<String> res = new LinkedList<>();
        int[] count = new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);
        for(String str: A){
            int[] temp = new int[26];
            str.chars().forEach(c-> ++temp[c-'a']);
            for(int i = 0; i<26; ++i){
                count[i] = Math.min(temp[i], count[i]);
            }
        }
        for(int i = 0; i<26; i++){
            while(count[i]>0){
                res.add(""+(char)('a'+i));
                count[i]--;
            }
        }
        return res;
    }
}
