class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int reverseX = 0, originalX = x;
        while(originalX!=0){
            reverseX *= 10;
            reverseX += originalX % 10;
            originalX /= 10;
        }
        return x==reverseX;
    }
}
