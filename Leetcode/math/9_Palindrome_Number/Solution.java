class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        ArrayList <Integer> X = new ArrayList<Integer> ();
        int temp;
        while (x>=10){
            temp = x/10;
            X.add(x - 10*temp);
            x = temp;
        }
        X.add(x);
        for (int i=0; i<X.size()/2; i++){
            if(X.get(i)!=X.get(X.size()-1-i)){
                return false;
            }
        }
        return true;
    }
}