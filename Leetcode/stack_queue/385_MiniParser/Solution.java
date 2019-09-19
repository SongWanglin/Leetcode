/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    private Deque<Character> dq = new ArrayDeque<>();
    private Set<Character> set = new HashSet(Arrays.asList('1','2','3','4','5','6','7','8','9','0','-'));
    public NestedInteger deserialize(String s) {
        char[] chs = s.toCharArray();
        for(int i = 0; i<chs.length; ++i){
            dq.add(chs[i]);
        }
        dq.add('x');
        return parsing();
        //return new NestedInteger();
    }
    private NestedInteger parsing(){
        String num = "";
        while( set.contains(dq.peekFirst()) ){
            num += dq.pollFirst();
        }
        if(num.length()!=0)
            return new NestedInteger(Integer.parseInt(num));
        dq.pollFirst();
        NestedInteger list = new NestedInteger();
        while( dq.peekFirst()!=']'){
            list.add(parsing());
            if( dq.peekFirst()==','){
                dq.pollFirst();
            }
        }
        dq.pollFirst();
        return list;
    }
}
