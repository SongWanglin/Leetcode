class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int digit = 0, addOne = 0, i = 0, l1 = a.length()-1, l2 = b.length()-1;
        while( i<a.length() || i<b.length() || addOne!=0){
            int first= (i< a.length())? Character.getNumericValue(a.charAt(l1-i)): 0 ;
            int last = (i<b.length())? Character.getNumericValue(b.charAt(l2-i)): 0 ;
            digit = first+last+addOne;
            int current = digit%2;
            addOne = digit/2;
            res.append(current);
            i++;
        }
        return res.reverse().toString();
    }
}
