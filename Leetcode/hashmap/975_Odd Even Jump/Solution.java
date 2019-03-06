class Solution {

    public int oddEvenJumps(int[] A) {
        int len = A.length, res = 1;
        if(len==1 )
            return res;
        int cur_location = 0, step = 0;
        for(int i = 0; i< len-1; i++){
            cur_location = i; step = 0;
            while(cur_location!=-1 && cur_location<len-1){
                ++step;
                cur_location = (step%2==0)?findMax(A, cur_location): findMin(A, cur_location);
                //System.out.print(cur_location+" ");
                if(cur_location == len-1){
                    res++;
                    break;
                }
            }
            //System.out.println(" ");
        }
        return res;
    }
        private int findMax(int[] A, int start){
            int max = Integer.MIN_VALUE, res = -1;
            for(int i = start+1; i<A.length; i++){
                if(A[i]>max && A[i]<=A[start]){
                    max = A[i]; res = i;
                }
            }
            return res;
        }

        private int findMin(int[] A, int start){
            int min = Integer.MAX_VALUE, res = -1;
            for(int i = start+1; i<A.length; i++){
                if(A[i]<min && A[i]>=A[start]){
                    min = A[i]; res = i;
                }
            }
            return res;
        }
        /*/
        //Fancy TreeMap Solution
    public int oddEvenJumps(int[] A) {
        int size = A.length;
        boolean[] odd = new boolean[size],
                  even = new boolean[size];

        TreeMap<Integer, Integer> tm = new TreeMap<>();

        odd[size-1] = even[size-1] = true;
        tm.put(A[size-1], size-1);
        int ret = 1;
        for(int i=size-2; i>=0; --i){
            Integer ceil = tm.ceilingKey(A[i]),
                    floor= tm.floorKey(A[i]); // the greatest key <= the given key or null

            if(ceil != null)
                odd[i] = even[tm.get(ceil)];
            if(floor!= null)
                even[i]= odd[tm.get(floor)];
            if(odd[i]) ret++;

            tm.put(A[i],i); // as a result, it will always keep a biggest pos of A[i].
        }
        return ret;
    }
    /*/
}
