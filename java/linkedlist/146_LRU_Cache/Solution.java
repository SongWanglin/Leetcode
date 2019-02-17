
class LRUCache {

    private class Node{
        int address;
        int data;
        Node prev;
        Node next;
    }
    private HashMap<Integer, Node> memory = new HashMap<Integer, Node>();
    private int capacity;
    private int storedItems = 0;
    private Node head = new Node(), tail = new Node();
    public LRUCache(int cap) {
        capacity = cap;
        head.prev = null;       tail.next = null;
        head.next = tail;       tail.prev = head;
    }

    public int get(int key) {
        Node temp = memory.get(key);
        if(temp!=null){
            moveToHead(temp);
            return temp.data;
        }
        return -1;
    }

    public void put(int key, int value) {
        Node temp = memory.get(key);
        if(temp!=null){
            temp.data = value;
            moveToHead(temp);
            return;
        }
        Node newNode = new Node();
        newNode.address = key; newNode.data = value;
        memory.put(key, newNode);
        addNode(newNode);
        ++storedItems;
        if(storedItems>capacity){
            evictTail();
        }
    }
        private void evictTail(){
            Node temp = removeTail();
            memory.remove(temp.address);
            --storedItems;
        }

        private Node removeTail(){
            Node res = tail.prev;
            removeNode(res);
            return res;
        }

        private void moveToHead(Node node){
            removeNode(node);
            addNode(node);
        }

        private void addNode(Node node){
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
        }

        private void removeNode(Node node){
            Node oldPrev = node.prev;
            Node oldNext = node.next;
            oldPrev.next = oldNext;
            oldNext.prev = oldPrev;
        }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
