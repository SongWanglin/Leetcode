class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> res = new HashMap<Integer, Integer>();
        int max = 0, tmp = 0, major= 0, len = nums.length;
        for (int i = 0; i<len; i++){
            if ( res.containsKey(nums[i])){
                res.put(nums[i], res.get(nums[i])+1);
            } else{
                res.put(nums[i], 1);
            }
        }
        for (int i: res.keySet()){
            tmp = res.get(i);
            if (tmp>max){
                max = tmp; major = i;
            }
        }
        return major;
    }
        
}
