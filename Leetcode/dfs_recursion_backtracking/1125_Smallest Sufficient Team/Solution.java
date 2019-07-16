class Solution {
    public int longestWPI(int[] hours) {
        int[] pre = new int[hours.length+1];
        int max = 0;
        for(int i=1; i <= hours.length; i++){
            if(hours[i-1] > 8){
                max = 1;
                pre[i] = pre[i-1]+1;
            }else
                pre[i] = pre[i-1]-1;
        }
        for(int i=0; i <= hours.length; i++){
            for(int j=hours.length; j > i; j--){
                if(pre[j]-pre[i] > 0){
                    max = Math.max(max, j-1-i+1);
                    break;
                }
            }
        }
        return max;
    }
}
