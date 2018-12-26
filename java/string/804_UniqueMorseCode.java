class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet <String> res = new HashSet<String>();
        for (int i =0; i<words.length; i++){
            res.add(getCode(words[i]));
        }
        return res.size();
    }

    public String getCode(String word){
        String [] morseCode =
        {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
         ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
         ".--","-..-","-.--","--.."};
        char[] w = word.toCharArray();
        String[] res = new String[w.length];
        for (int i=0; i<w.length; i++){
            res[i] = morseCode[(int)w[i] - (int)'a'];
        }
        return String.join(",",res).replace(",","");
    }
}
