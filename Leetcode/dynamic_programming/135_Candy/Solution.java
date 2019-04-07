class Solution {
    public int candy(int[] ratings) {
        if(ratings==null || ratings.length==0){
            return 0;
        }
        int res = 1, prev_top = 1, decrement_count = 0;
        for(int i = 1; i<ratings.length; i++){
            if(ratings[i-1 ] > ratings[i]){
                decrement_count++;
                continue;
            }
            if(decrement_count>0){
                res += (decrement_count+1)*decrement_count/2;
                if(decrement_count >= prev_top) res+= decrement_count-prev_top+1;
                decrement_count = 0;
                prev_top = 1;
            }
            prev_top = (ratings[i-1]==ratings[i])? 1: prev_top+1;
            res += prev_top;
        }
        // if decreasing at the end
        if(decrement_count>0){
                res += (decrement_count+1)*decrement_count/2;
                if(decrement_count >= prev_top) res+= decrement_count-prev_top+1;
                decrement_count = 0;
                prev_top = 1;
            }
        return res;
    }
}
