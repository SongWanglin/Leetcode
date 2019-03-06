class LFUCache {
    private class Node{
        int address, data, count;
        Node prev;
        Node next;
    }
    /* double linked list with dummy head and tail */
    private class DoubleLL{
        Node head = new Node(), tail = new Node();
        int size = 0;
        private DoubleLL(){
            head.prev = null;   head.next = tail;
            tail.prev = head;   tail.next = null;
        }
        private Node popTail(){
            if(size > 0){
                Node res = tail.prev;
                removeNode(res);
                return res;
            }
            return null;
        }
        private void addNode(Node node){
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
            size ++;
        }

        private void removeNode(Node node){
            Node oldPrev = node.prev;
            Node oldNext = node.next;
            oldPrev.next = oldNext;
            oldNext.prev = oldPrev;
            size --;
        }
    }
    /* attributes of LFUCache */
    int capacity, storedEntries = 0, min = 0;
    HashMap<Integer, Node> data = new HashMap<>();
    HashMap<Integer, DoubleLL> freq = new HashMap<>();
    public LFUCache(int cap) {
        capacity = cap;
    }

    public int get(int key) {
        if(data.containsKey(key)){
            Node temp = data.get(key);
            update(temp);
            return temp.data;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(capacity==0){
            return;
        }
        Node node;
        if(data.containsKey(key)){
            node = data.get(key);
            node.data = value;
            update(node);
            return;
        }
        if(storedEntries == capacity){
            evictLFU();
        }
        node = new Node();
        node.address = key; node.data = value;
        node.count = 1;
        storedEntries++;    data.put(key, node);
        min = 1;
        DoubleLL list;
        if(freq.containsKey(min)){
            list = freq.get(min);
        }else{
            list = new DoubleLL();
        }
        list.addNode(node);
        freq.put(min, list);
    }
        private void evictLFU (){
            DoubleLL list = freq.get(min);
            int key = list.popTail().address;
            data.remove(key);
            storedEntries--;
        }
        private void update(Node node){
            DoubleLL oldList = freq.get(node.count);
            oldList.removeNode(node);
            if(node.count == min && oldList.size == 0){
                min++;
            }
            node.count +=1;
            DoubleLL newList;
            if(!freq.containsKey(node.count)){
                newList = new DoubleLL();
            } else{
                newList = freq.get(node.count);
            }
            newList.addNode(node);
            freq.put(node.count, newList);
        }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
