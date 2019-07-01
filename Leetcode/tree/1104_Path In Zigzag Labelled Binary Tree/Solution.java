class Solution {
    /*/
    public List<Integer> pathInZigZagTree(int label) {
        int k = 0;
        while( (int)Math.pow(2, k)-1 <= label) k++;
        int max = (int)Math.pow(2, k)-1;
        int[] tree_arr = new int[max];
        List<Integer> res= new ArrayList<>();
        for(int i = 0; i< label; i++){
            tree_arr[i] = i+1;
        }
        int level = 0;
        for(level = 0; (int)Math.pow(2, level)-1 < label; level++){
            int start = (int)Math.pow(2, level)-1, end = (int)Math.pow(2, level+1)-2;
            if(level%2==0){
                continue;
            }
            swap(tree_arr, start, end);
        }
        int target = 0;
        for(int i = 0; i<max; i++){
            //System.out.println(tree_arr[i]);
            if(tree_arr[i]==label){
                target = i;
            }
        }
        while(target>=0){
            res.add(0, tree_arr[target]);
            target = (target%2==0)? (target-2)/2: (target-1)/2;
        }
        return res;
    }
        private void swap(int[] arr, int start, int end){
            for(int i = start, j = end; i <= j; i++, j--){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    /*/
    public List<Integer> pathInZigZagTree(int label) {
        int rows = -1;
        int cur = label;
        while(cur>0){
            int curRowLen = (int)Math.pow(2,++rows);
            cur-=curRowLen;
        }
        List<Integer> res = new ArrayList();
        res.add(label);
        while(label>1){
            int lastStart = (int)Math.pow(2,--rows);
            int lastLabel = lastStart*3-1-label/2;
            res.add(lastLabel);
            label = lastLabel;
        }
        Collections.reverse(res);
        return res;
    }
}
