class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> dq = new ArrayDeque<>();
        for(int i = 0; i<num.length(); ++i){
            char temp = num.charAt(i);
            while(!dq.isEmpty() && dq.peekLast()>temp && k>0){
                dq.pollLast();
                k--;
            }
            dq.add(temp);
        }
        while(!dq.isEmpty() && k>0){
            dq.pollLast(); k--;
        }
        while(!dq.isEmpty() && dq.peekFirst()=='0'){
            dq.pollFirst();
        }
        if(dq.isEmpty()) return "0";
        String res = "";
        while(!dq.isEmpty()) res += dq.pollFirst();
        return res;
    }
}
