import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Solution {
    public String PrintMinNumber(int [] numbers) {
        String res = new String()a;
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: numbers){
            list.add(num);
        }
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return (a+""+b).compareTo(b+""+a);
            }
        });
        for(int num : list){
            res += num;
        }
        return res;
    }
}
