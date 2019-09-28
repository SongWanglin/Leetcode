class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord))
            return 0;
        Set<String> visited = new HashSet<>(), curlevel = new HashSet<>();
        visited.add(beginWord); curlevel.add(beginWord);
        int res = 1;
        while(!curlevel.contains(endWord)){
            Set<String> nextlevel = new HashSet<>();
            for(String src: curlevel){
                for(String dest: wordList){
                    if(!visited.contains(dest) && wordDiff(src, dest)==1){
                        nextlevel.add(dest);
                        visited.add(dest);
                    }
                }
            }
            if(nextlevel.isEmpty())
                return 0;
            res+=1;
            curlevel = nextlevel;
        }
        return res;
    }
        private int wordDiff(String word1, String word2){
            int res = 0;
            for(int i = 0; i<word1.length();  ++i){
                if(word1.charAt(i)!=word2.charAt(i))
                    res += 1;
            }
            return res;
        }
}
