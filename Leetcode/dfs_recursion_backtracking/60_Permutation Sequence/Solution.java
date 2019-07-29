class Solution {
    public String getPermutation(int n, int k){
        StringBuilder res = new StringBuilder();
        List<Integer> nums = new ArrayList<>();
        int[] factorial = new int[n+1];
        int index = 0;
        Arrays.fill(factorial, 1);
        for(int i = 1; i<=n; i++){
            factorial[i] = factorial[i-1]*i;
            nums.add(i);
        }
        k -= 1;
        for(int i = 1; i<=n; i++){
            index = k/factorial[n-i];
            res.append(nums.get(index));
            nums.remove(index);
            k -= index*factorial[n-i];
        }
        return res.toString();
    }

    /*/
    public String getPermutation(int n, int k) {
        ArrayList<String> res = new ArrayList<>();
        if(n==0) return null;
        int[] nums = new int[n];
        boolean[] used = new boolean[n];
        for(int i = 0; i<n; i++){
            nums[i] = i+1;
        }
        dfs(res, nums,  0);
        return res.get(k-1);
    }
        private void dfs(ArrayList<String> res,
                         int[] nums, int index){
            if ( index==nums.length){
                StringBuilder sb = new StringBuilder();
                for(int num: nums){ sb.append(num);}
                System.out.println(sb.toString());
                res.add(sb.toString());
                return;
            }
            for (int i = index; i<nums.length; ++i){
                swap(nums, index, i);
                dfs(res, nums, index+1);
                swap(nums, index, i);
            }
        }
        private void swap(int[] nums, int i, int j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }/*/
}


