class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[T.length];
        for(int i = 0; i<T.length; i++){
            while( !stack.isEmpty()&&T[stack.peek()]<T[i]){
                int index = stack.pop();
                res[index] = i-index;
            }
            stack.push(i);
        }
        return res;
    }
}
