/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: the minimum number of conference rooms required
     */
    public int minMeetingRooms(List<Interval> intervals) {
        // Write your code here

        Interval[] intervalArr = new Interval[intervals.size()];
        intervalArr = intervals.toArray(intervalArr);
        if(intervalArr == null || intervalArr.length == 0) return 0;
        Arrays.sort(intervalArr, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                return i1.start - i2.start;
            }
        });
        PriorityQueue<Interval> heap = new PriorityQueue<>((a,b)->a.end-b.end);
        heap.add(intervalArr[0]);
        for( int i = 1; i<intervalArr.length; i++){
            Interval tmp = heap.poll();
            if(intervalArr[i].start >= tmp.end){
                tmp.end = intervalArr[i].end;
            }else{
                heap.offer(intervalArr[i]);
            }
            heap.offer(tmp);
        }
        return heap.size();
        /* Fancy TreeMap Solution */
        /*/
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(Interval interval: intervalArr){
            map.put(interval.start, map.getOrDefault(interval.start, 0)+1);
            map.put(interval.end, map.getOrDefault(interval.end, 0)-1);
        }
        int res = 0, mid = 0;
        for(int m: map.values()){
            res = Math.max(res, mid+=m);
        }
        return res;/*/
    }
}
