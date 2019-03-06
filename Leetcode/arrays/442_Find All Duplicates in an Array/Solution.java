class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        LinkedList<Integer> res = new LinkedList<Integer>();
        int num;
        for (int i=0; i<nums.length; i++){
            num = Math.abs(nums[i]);
            if(nums[num-1]>0){
                nums[num-1] *= -1;
            }else{
                res.add(num);
            }
        }
        return res;
    }
}
