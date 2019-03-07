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
     * @return: if a person could attend all meetings
     */
    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here
        Interval[] intervalArr = new Interval[intervals.size()];
        intervalArr = intervals.toArray(intervalArr);
        if(intervalArr == null || intervalArr.length == 0) return true;
        Arrays.sort(intervalArr, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                return i1.start - i2.start;
            }
        });

        int end = intervalArr[0].end;
        for( int i = 1; i<intervalArr.length; i++){
            if(intervalArr[i].start < end){
                return false;
            }
            end = Math.max(end, intervalArr[i].end);
        }
        return true;
    }
}
