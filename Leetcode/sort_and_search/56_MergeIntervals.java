/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size()<2)
            return intervals;
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        List<Interval> res = new ArrayList<Interval>();
        Interval temp = intervals.get(0), temp2 = temp;
        for (int i=1; i<intervals.size(); i++){
            temp2 = intervals.get(i);
            if(temp2.start<=temp.end){
                temp.end = Math.max(temp2.end, temp.end);
            } else{
                res.add(temp);
                temp = temp2;
            }
        }
        res.add(temp);
        return res;
    }
}
