class DinnerPlates { // priority queue solution
    PriorityQueue<Integer> available;
    int cap;
    int max;
    Map<Integer, ArrayDeque<Integer>> map;
    public DinnerPlates(int capacity) {
        this.cap = capacity;
        this.map = new HashMap();
        this.max = 0;
        map.put(max, new ArrayDeque<>());
        available = new PriorityQueue<>();
    }

    public void push(int val) {
        if(!available.isEmpty()){
            int index = available.poll();
            map.get(index).add(val);
            return;
        }
        while(map.containsKey(max) && map.get(max).size()==cap){
            max++;
        }
        if(!map.containsKey(max))
            map.put(max, new ArrayDeque<>());
        map.get(max).add(val);
    }

    public int pop() {
        if(max==-1){
            max = 0;
            return -1;
        }
        if(map.get(max).size()==0){
            max--;
            return pop();
        }
        int res = map.get(max).pollLast();
        if(map.get(max).size()==0) max--;
        return res;
    }

    public int popAtStack(int index) {
        if(!map.containsKey(index)||map.get(index).size()==0)
            return -1;
        int res = map.get(index).pollLast();
        available.offer(index);
        return res;
    }
}

/**
 * Your DinnerPlates object will be instantiated and called as such:
 * DinnerPlates obj = new DinnerPlates(capacity);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAtStack(index);
 */
/*/ // two pointer solution
class DinnerPlates {
    Map<Integer, ArrayDeque<Integer>> map;
    int cap;
    int current;
    int last;
    int count;
    public DinnerPlates(int capacity) {
        this.cap = capacity;
        this.current = 0;
        this.last = 0;
        this.count = 0;
        map = new HashMap<>();
        map.put(current, new ArrayDeque<>());
    }

    public void push(int val) {
        while(map.containsKey(current) && map.get(current).size()==cap){
            current++;
        }
        if(!map.containsKey(current)){
            map.put(current, new ArrayDeque<>());
        }
        map.get(current).add(val);
        last = Math.max(last, current);
        count++;
    }

    public int pop() {
        if(count==0) return -1;
        while(last>=0 && map.get(last).isEmpty()){
            last--;
        }
        count--;
        current = Math.min(current, last);
        return map.get(last).pollLast();
    }

    public int popAtStack(int index) {
        if(!map.containsKey(index)||map.get(index).isEmpty()){
            return -1;
        }
        count--;
        current = Math.min(current, index);
        return map.get(index).pollLast();
    }
} /*/

/**
 * Your DinnerPlates object will be instantiated and called as such:
 * DinnerPlates obj = new DinnerPlates(capacity);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAtStack(index);
 */

