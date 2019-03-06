public class Solution {
    /**
     * @param p: the point List
     * @return: the numbers of pairs which meet the requirements
     */
    public int pairNumbers(Point[] p) {
        // Write your code here
        int oo=0, ee=0, oe=0, eo=0;
        for (Point temp: p){
            boolean xEven = temp.x%2==0;
            boolean yEven = temp.y%2==0;
            if(xEven&&yEven){ ee++; }
            else if(!xEven&&!yEven){ oo++; }
            else if(!xEven&& yEven){ oe++; }
            else { eo++;}
        }
        return combination(oo)+combination(ee)+
            combination(eo)+combination(oe);
    }
        private int combination(int n){
            return n*(n-1)/2;
        }
}
