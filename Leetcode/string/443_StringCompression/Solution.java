class Solution {
    public int compress(char[] chars) {
        if (chars==null||chars.length==0 )
            return 0;
        int res = 0;
        for (int end =0, count = 0; end < chars.length; end++){
            count++;
            if (end == chars.length-1 || chars[end]!=chars[end+1]){
                chars[res]=chars[end];
                res++;
                if (count!=1){
                    char[] arr = String.valueOf(count).toCharArray();
                    for (int i = 0; i<arr.length; i++, res++)
                        chars[res] = arr[i];
                }
            count = 0;
            }
        }
        return res;
    }
}
