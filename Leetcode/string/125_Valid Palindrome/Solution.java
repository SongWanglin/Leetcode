public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        int head = 0, tail = s.length()-1;
        char first, last;
        while(head<=tail){
            first = s.charAt(head);
            last = s.charAt(tail);
            if (!Character.isLetterOrDigit(first)){
                head++;
            } else if(!Character.isLetterOrDigit(last)){
                tail--;
            } else{
                if(Character.toLowerCase(first)!=Character.toLowerCase(last) ){
                    return false;
                }
                head++;tail--;
            }
        }
        return true;
    }
}
