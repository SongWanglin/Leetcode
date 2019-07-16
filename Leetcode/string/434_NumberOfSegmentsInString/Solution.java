class Solution {
    public int countSegments(String s) {
        if("".equals(s))
            return 0;
        String[] segments = s.split(" ");
        int count=0;
        for(int i=0;i<segments.length;i++)
            if(!"".equals(segments[i].trim()))
                count++;
        return count;
    }
}
