class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a,b)->a[1]-b[1]);
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a);
        int t = 0;
        for(int[] c: courses){
            t += c[0];
            q.add(c[0]);
            if(t > c[1])
                t -= q.poll();
        }
        return q.size();
    }
}
