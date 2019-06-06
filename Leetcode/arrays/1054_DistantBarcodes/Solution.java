class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int maxFreqCode = 0, i = 0, l = barcodes.length;
        int[] freq = new int[10001], res = new int[l];
        for(int c: barcodes){               // count the frequency of each code
            if(freq[c]>freq[maxFreqCode]){  // update the maximum frequency code
                maxFreqCode = c;
            }
            freq[c]++;
        }
        for(int j = 0; j<freq.length; ++j){
            int code = j ==0 ? maxFreqCode : j;     // fill in most frequent code first
            while(freq[code] > 0){
                res[i] = code;
                i = (i+2<l)? i+2:1;
                freq[code]--;
            }
        }
        return res;
    }
}
