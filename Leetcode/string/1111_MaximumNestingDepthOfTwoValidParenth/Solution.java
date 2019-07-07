class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        /*/char[] charArr = seq.toCharArray();
        int[] res = new int[charArr.length];
        Stack<Character> lefts = new Stack<>();
        int curMax = 0, i = 0;
        while(charArr[i]==')'){
            res[i] = -1; i++;
        }
        for(; i<charArr.length; i++){
            curMax += (charArr[i]=='(')? 1: (charArr[i]==')')?-1: 0;
            lefts.add(charArr[i]);
            if(curMax == 0){
                int index = i;
                while(!lefts.isEmpty()){
                    char tmp = lefts.pop();

                    res[index--] = curMax;
                    curMax += (tmp==')') ?1: -1;
                }
            }
        }
        return res;/*/
        /*/ bit manipulation magic
        int n = seq.length(), res[] = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = (seq.charAt(i) == '(') ? (i & 1) : (1 - i & 1);
        return res;
        /*/
        int n = seq.length(), lv = 0;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            char c = seq.charAt(i);
            res[i] = ( c == '(')? (lv++)%2: (--lv)%2;
        }
        return res;

    }
}
