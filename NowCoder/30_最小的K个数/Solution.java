import java.util.Arrays;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> res = new ArrayList<>();
        if(input.length<k)
            return res;
        for(int i = 0; i<k; i++){
            res.add(input[i]);
        }
        return res;
    }
}
