class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<2)
            return intervals;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0]-b[0];
            }
        });
        List<int[]> list = new LinkedList<>();
        int[] temp = intervals[0];
        for(int i = 1; i<intervals.length; ++i){
            if (temp[1]>=intervals[i][0]){
                int[] temp2 = mergeInterval(temp, intervals[i]);
                temp = temp2;
            }else{
                list.add(temp);
                temp = intervals[i];
            }
            if(i==intervals.length-1)
                list.add(temp);
        }
        int[][] res = new int[list.size()][2];
        for(int i = 0; i<res.length; ++i){
            res[i] = list.get(i);
        }
        return res;
    }
    private int[] mergeInterval(int[] interval1, int[] interval2){
        return new int[] {Math.min(interval1[0], interval2[0]), Math.max(interval1[1], interval2[1])};
    }
}


