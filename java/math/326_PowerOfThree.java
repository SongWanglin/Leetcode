class Solution {
    public boolean isPowerOfThree(int n) {
        if (n!=1 && n%3!=0){
            return false;
        } else{
            for (int i=0; i<Math.log(n)/Math.log(3)+1; i++){
                if (Math.pow(3, i)==n)
                    return true;
            }
        }
        return false;
    }
}
