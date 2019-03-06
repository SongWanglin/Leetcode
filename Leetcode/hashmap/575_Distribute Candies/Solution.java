class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> catagory = new HashSet<Integer>();
        int res = 0;
        for (int i = 0; i<candies.length; i++){
            if(catagory.add(candies[i])){ res++;}
        }
        return res>candies.length/2 ? candies.length/2: res;
    }
}
