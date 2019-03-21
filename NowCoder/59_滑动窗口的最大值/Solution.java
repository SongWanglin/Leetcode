import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> res = new ArrayList<>();
        if(num==null || size<1 || size > num.length){
            return res;
        }
        Deque<Integer> tmp = new LinkedList<>();
        for(int i = 0; i<num.length; i++){
            while(!tmp.isEmpty() && i-size+1 > tmp.peek()){
                tmp.poll();
            }
            while(!tmp.isEmpty() && num[i]>num[tmp.getLast()]){
                tmp.pollLast();
            }
            tmp.add(i);
            if(i>=size-1){
                res.add(num[tmp.getFirst()]);
            }
        }
        return res;
    }
}
