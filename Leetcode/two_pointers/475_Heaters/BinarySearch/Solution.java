class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        // two pointers
        /*/
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int res = 0, j = 0;
        for(int i = 0; i<houses.length; i++){
            while( j<heaters.length-1
                 && Math.abs(heaters[j+1]-houses[i]) <= Math.abs(heaters[j]-houses[i])){
                j++;
            }
            res = Math.max(res, Math.abs(heaters[j]-houses[i]));
        }
        return res;/*/
        // binary search solution
        Arrays.sort(heaters);
        int res = 0;
        for(int house: houses){
            int index = Arrays.binarySearch(heaters, house);
            if(index >=0) continue;
            index = -(index+1);
            int dist1 = index - 1 >= 0? house-heaters[index-1]: Integer.MAX_VALUE;
            int dist2 = index < heaters.length ? heaters[index]-house: Integer.MAX_VALUE;
            res = Math.max(res, Math.min(dist1, dist2));
        }
        return res;
    }
}


