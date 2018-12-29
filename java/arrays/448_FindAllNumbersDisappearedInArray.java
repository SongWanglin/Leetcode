class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List res = new ArrayList();
        int num;
        for (int i=0; i<nums.length; i++){
            num = Math.abs(nums[i]);
            if(nums[num-1]>0)   nums[num-1] *= -1;
        }
        for (int i=0; i<nums.length; i++){
            if(nums[i]>0)   res.add(i+1);
        }
        return res;
    }
}
