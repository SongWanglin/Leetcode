class Solution {
    /*/
    number of the digits at each "level"
    1-9: 9 digits
    10-99 : 90 * 2 = 180 digits
    100-999 : 900 * 3 = 2700 digits
    1000-9999 : 9000 * 4 = 36000 digits
    ....
    */
    public int findNthDigit(int n) {
        if(n < 1) return 0;
        if(n < 10) return n;
        int counter = 1, base = 0;
        while(n > (9 * Math.pow(10,counter -1) * (counter))){
            base += 9 * Math.pow(10,counter -1);
            n -= (9 * Math.pow(10,counter -1) * (counter));
            counter++;
        }
        //target is the actual number that has nth digit
        int target = base + ((n + counter - 1) / counter);  //to get the ceiling of n / counter
        int offset = n % counter;
        offset = (offset == 0) ? 0:counter - offset;
        for(int i = 0; i < offset; i++){
            target = target / 10;
        }
        return target % 10;
    }
}

