class Solution {
    public boolean isUgly(int num) {
        /*/
        if (num==0)
            return false;
        while (num%2==0 || num%3==0 || num%5==0){
            num = (num%2==0)?num/2: (num%3==0)? num/3:
                (num%5==0)?num/5: num;
        }
        return num == 1;
        /*/

        return (num==0)? false: (num==1)?true: (num%2==0)?isUgly(num/2):
                (num%3==0)?isUgly(num/3):  (num%5==0)?isUgly(num/5): false;
    }
}
