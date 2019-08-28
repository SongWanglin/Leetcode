class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] strs = text.split(" ");
        List<String> res = new ArrayList<>();
        for(int i = 0; i<strs.length-2; ++i){
            if( strs[i].equals(first) && strs[i+1].equals(second) ){
                res.add(strs[i+2]);
            }
        }
        return res.toArray(new String[0]);
    }
}
