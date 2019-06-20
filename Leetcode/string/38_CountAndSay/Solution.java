class Solution {
    public String countAndSay(int n) {
        StringBuilder curr = new StringBuilder("1");
        StringBuilder prev;
        int count;
        char say;
        for(int i = 1; i<n; i++){
        // two pointer tracking
            prev = curr;
            curr = new StringBuilder();
            count = 1;  say = prev.charAt(0);
            for(int j=1, len = prev.length(); j<len; j++){
                if(prev.charAt(j)==say){
                    count++;
                    continue;
                }
                curr.append(count).append(say);
                count = 1;
                say = prev.charAt(j);
            }
            curr.append(count).append(say);
        }
        return curr.toString();
    }
}
