class Solution {
    public boolean isValid(String s) {
        Deque<Character> temp = new LinkedList<Character>();
        char[] s2 = s.toCharArray();
        int dif;
        for (int i=0; i<s2.length; i++){
            if (s2[i]=='(' || s2[i] == '[' || s2[i] =='{'){
                temp.add(s2[i]);
            } else if (temp.isEmpty()){
                return false;
            } else {
                dif = (int)(s2[i]-temp.pollLast());
                if (dif!=1 && dif!=2){
                    return false;
                }
            }
        }
        if (!temp.isEmpty())
            return false;
        return true;
    }
}
