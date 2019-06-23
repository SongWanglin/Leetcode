class Solution {
    public double[] sampleStats(int[] count) {
        double mode = -1, modeNum = 0, min = 256, max = 0, sum = 0, median = -1;
        double[] res = new double[5];
        int num = 0;
        for(int i = 0; i<256; i++){
            if(count[i]!=0){
                min = Math.min(min, i); max = Math.max(max, i);
                sum += (double)count[i] * i;
                num += count[i];
                if(modeNum < count[i]){
                    modeNum = count[i];
                    mode = i;
                }
            }
        }
        int m = -1;
        if( num%2 == 1){
            m = num/2 + 1;
            int n = 0;
            for(int i = 0; i<256; i++){
                n += count[i];
                if(n>=m){ median = i; break; }
            }
        } else{
            m = num /2;
            double last = -1;
            int n = 0;
            for (int i = 0; i < 256; i++) {
                if (n < m && n + count[i] >= m + 1) {
                    median = i;
                    break;
                } else if (n == m && n + count[i] >= m + 1) {
                    median = (last + i) / 2;
                    break;
                }
                n += count[i];
                last = i;
            }
        }
        res[0] = min;
        res[1] = max;
        res[2] = sum /num;
        res[3] = median;
        res[4] = mode;
        return res;
    }
}

