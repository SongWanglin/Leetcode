class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int length = letters.length, low = 0, high = length, mid = 0;
        while(low < high){
            mid = (low+high)/2;
            if(letters[mid]>target) high = mid;
            else low = mid+1;
        }
        return letters[low%length];
    }
}
