class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int giveaway = 0, limit = candies;
        for(int i = 0; candies>0; i++){
            giveaway++;
            res[i%num_people] += (candies>giveaway)? giveaway: candies;
            candies -= giveaway;
        }
        return res;
    }
}
