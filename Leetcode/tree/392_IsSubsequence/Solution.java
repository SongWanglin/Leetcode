class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        Queue<Character> q = new LinkedList<>();
        for(Character c: s.toCharArray()){
            q.offer(c);
        }
        for(int i = 0; i<t.length(); ++i){
            if(!q.isEmpty() && t.charAt(i)==q.peek())
                q.poll();
        }
        return q.isEmpty();
    }
}
