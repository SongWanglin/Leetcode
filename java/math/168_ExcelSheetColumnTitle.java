class Solution {
    public String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();
        while(n!=0){
            n--;
            builder.insert(0, (char)(65+n%26));
            n = n/26;
        }
        return builder.toString();
    }
    /* first submission */
    /*/
    public String convertToTitle(int n) {
        LinkedList<Character> chs = new LinkedList<Character>();
        while(n!=0){
            int temp = n%26;
            if (temp==0){
                chs.add('Z');
                n = (n-1-temp)/26;
            }else{
                chs.add((char)(temp+64));
                n = (n-temp)/26;
            }
        }
        StringBuilder builder = new StringBuilder(chs.size());
        for (int i=chs.size()-1; i>=0; i--){
            builder.append(chs.get(i));
        }
        return builder.toString();
    }
    /*/
}
