class Solution {
    public String[] findWords(String[] words) {
    /*/ One liner
    return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    /*/
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<row1.length(); i++){
            map.put(row1.charAt(i), 1);
        }
        for(int i = 0; i<row2.length(); i++){
            map.put(row2.charAt(i), 2);
        }
        for(int i = 0; i<row3.length(); i++){
            map.put(row3.charAt(i), 3);
        }
        List<String> word = new ArrayList<>();
        for(String s: words){
            boolean same = true;
            int row = map.get(Character.toLowerCase(s.charAt(0)));
            for(int i = 1; i<s.length(); i++){
                if( row != map.get(Character.toLowerCase(s.charAt(i))) ){
                    same = false;
                    break;
                }
            }
            if(same)
                word.add(s);
        }
        String[] res = new String[word.size()];
        word.toArray(res);
        return res;
    }
}
