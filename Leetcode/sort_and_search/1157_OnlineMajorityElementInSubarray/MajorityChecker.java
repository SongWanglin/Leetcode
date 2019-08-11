class MajorityChecker {
    private  int[] nums;
    public MajorityChecker(int[] arr) {
        this.nums = arr;
    }

    public int query(int left, int right, int threshold) {
        /*/// why the fuck isn't hashmap working?
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = left; i<=right; i++){
            map.put(this.nums[i], map.getOrDefault(this.nums[i], 0)+1);
        }
        for(int num: map.keySet()){
            int time = map.get(num);
            if(time>=threshold)
                return num;
        }
        return -1;/*/
        int major = nums[left];
        int count = 1, res = 0;
        for(int i = left+1; i<= right; i++){
            if(major==nums[i]){
                count++;
            } else if(count==0){
                major = nums[i];
                count = 1;
            } else{
                count--;
            }
        }
        for(int i = left; i<=right; i++){
            if(nums[i]==major)
                res++;
        }
        return (res >= threshold)? major: -1;
    }
}

/**
 * Your MajorityChecker object will be instantiated and called as such:
 * MajorityChecker obj = new MajorityChecker(arr);
 * int param_1 = obj.query(left,right,threshold);
 */
