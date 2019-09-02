class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        int[][] puz = new int[puzzles.length][2];
        List<Integer> res = new ArrayList<>();
        int[] word = new int[words.length];
        for(int i = 0; i<puzzles.length; i++){
            puz[i][0] = (int)(puzzles[i].charAt(0)-'a');
            for(int j = 0; j<puzzles[i].length(); j++){
                int bit = 1<<(puzzles[i].charAt(j)-'a');
                puz[i][1]|= bit;
            }
            System.out.println(puz[i][0]+" "+puz[i][1]);
        }
        for(int i = 0; i<words.length; i++){
            for(int j = 0; j<words[i].length(); j++){
                int bit = 1 << (words[i].charAt(j)-'a');
                word[i]|=bit;
            }
            System.out.println(word[i]);
        }
        for(int i = 0; i<puz.length; i++){
            int count = 0;
            for(int j = 0; j<word.length; j++){
                if( ( puz[i][1]|word[j] )!= puz[i][1]  ) continue;
                if( (word[j]&(1<<puz[i][0]))!=0 )
                    count+=1;
            }
            res.add(count);
        }
        return res;
    }
}
