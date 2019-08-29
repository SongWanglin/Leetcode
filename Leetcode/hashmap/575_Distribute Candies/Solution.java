class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> types = new HashSet<>();
        for(int num: candies){
            types.add(num);
        }
        return Math.min(candies.length/2, types.size());
    }
}
