class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length, i = n-1;
        if ( n==0)
            return new int[]{1};
        while(i>=0){
            digits[i] +=1;
            if(digits[i]==10 && i!=0){
                digits[i]=0;
                i--;
            }else{
                break;
            }
        }
        if(digits[0] == 10){
            int res[] = new int[n+1];
            res[0] = 1; res[1] = 0;
            for(int j=1; j<n; j++){
                res[j+1]=digits[j];
            }
            return res;
        }
        return digits;
    }
}
