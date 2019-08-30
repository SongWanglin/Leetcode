class Solution {
    // waiting to be optimized
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int start = i+1, end = nums.length-1;
            while(start<end){
                int a = nums[start], b = nums[end];
                if(a+b+nums[i]==0){
                    List<Integer> temp = Arrays.asList(a, b, nums[i]);
                    res.add(temp);
                    while(start<end && nums[start]==nums[start+1]) start++;
                    while(start<end && nums[end]==nums[end-1]) end--;
                }
                if(a+b+nums[i]>0){
                    end-=1;
                }else{
                    start+=1;
                }
            }
        }
        return res;
    }

     /*///brute force, TLE
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i<nums.length-2; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i+1; j<nums.length; j++){
                if(set.contains(-nums[i]-nums[j])){
                    int[] arr = {nums[i], -nums[i]-nums[j], nums[j]};
                    Arrays.sort(arr);
                    List<Integer> temp = new LinkedList<>();
                    for(int num: arr) temp.add(num);
                    if(!res.contains(temp))
                        res.add(temp);
                }
                set.add(nums[j]);
            }
        }
        return res;
    }/*/
}
