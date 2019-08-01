class Solution {
public:
    bool isPerfectSquare(int num) {
        if(num==1) return true;
        int low = 0, high = num;
        while(low<high){
            long mid = (low+high)/2;
            if(mid*mid==num) return true;
            if(mid*mid>num){
                high = (int)mid;
            }else{
                low = (int)mid + 1;
            }
        }
        return false;
    }
};
