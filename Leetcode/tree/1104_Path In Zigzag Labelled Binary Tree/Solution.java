class Solution {
    public List<Integer> pathInZigZagTree(int label){
        List<Integer> res = new LinkedList<>();
        if(label<=0) return res;
        int level = 0;
        while(Math.pow(2, level)-1<label) level++;
        level--;
        while(level!=0){
            res.add(0, label);
            int pos = label - (int)Math.pow(2, level);
            label = label-(pos+1)-pos/2;
            level--;
        }
        res.add(0,1);
        return res;
    }
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
        }/*/
}
