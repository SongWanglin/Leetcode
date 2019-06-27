class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /* two sum I*/
        /*/
        HashMap<Integer, Integer> match = new HashMap<>();
        for (int i=0; i<numbers.length; i++){
            if (match.containsKey(target-numbers[i])){
                return new int[]{match.get(target-numbers[i])+1, i+1};
            } else{
                match.put(numbers[i], i);
            }
        }
        return null;/*/
        int start = 0, end = numbers.length-1;
        while (numbers[start]+numbers[end]!=target){
            if(numbers[start]+numbers[end]>target) end--;
            else start++;
        }
        return new int[] {start+1, end+1};
    }
}
