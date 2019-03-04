import java.util.Hashtable;
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null)
            return null;
        Hashtable<RandomListNode, RandomListNode> map = new Hashtable<>();
        RandomListNode tmp = pHead;
        while(tmp!=null){
            map.put(tmp, new RandomListNode(tmp.label));
            tmp = tmp.next;
        }
        RandomListNode res = map.get(pHead);
        RandomListNode tmp2 = res;
        tmp = pHead;
        while(tmp!=null){
            tmp2.next = (tmp.next==null)? null: map.get(tmp.next);
            tmp2.random = (tmp.random==null)? null: map.get(tmp.random);
            tmp = tmp.next;
            tmp2 = tmp2.next;
        }
        return res;
    }
}
