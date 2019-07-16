class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        int alpha[] = new int[26];
        for(int i = 0; i<magazine.length(); i++){
            alpha[magazine.charAt(i)-'a']++;
            if(i<ransomNote.length()) alpha[ransomNote.charAt(i)-'a']--;
        }
        for(int num: alpha){
            if(num<0) return false;
        }
        return true;
    }
}
