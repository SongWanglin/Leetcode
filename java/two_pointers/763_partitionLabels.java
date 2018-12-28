class Solution {
    public List<Integer> partitionLabels(String S) {
        char[] s1 = S.toCharArray();
        HashMap<Character, Integer> charLastIndex =
            new HashMap<Character, Integer>();
        for (int i = 0; i<s1.length; i++){
            charLastIndex.put(s1[i], i);
        }
        int start = 0, end = 0;
        LinkedList <Integer> res =  new LinkedList<Integer>();
        for (int i = 0; i<s1.length;){
            start = i;
            end = charLastIndex.get(s1[i]);
            while(end > i){
                i++;
                end = Math.max(end, charLastIndex.get(s1[i]));
            }
            res.add(end -start+1);
            i = end +1;
        }
        System.out.println(charLastIndex);
        return res;
    }
}
