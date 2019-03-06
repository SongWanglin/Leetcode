import java.util.HashMap;
class Solution {
    public int repeatedNTimes(int[] A) {
        //HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] map = new int[10000];
        for (int i= 0; i<A.length; i++){
            //if (!map.containsKey(A[i]))
            //    map.put(A[i], i);
            //if (map.get(A[i]) != i)
             //   return A[i];
            if (map[A[i]]++ == 1)
                return A[i];
        }
        return -1;
    }
}
