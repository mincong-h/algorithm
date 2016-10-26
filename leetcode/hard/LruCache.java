public class LRUCache {

    private Map<Integer, Node> cache;
    private int count;
    private int capacity;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {

        this.capacity = capacity;
        count = 0;
        cache = new HashMap<>();
        head = new Node(0, 0); // dummy head
        tail = new Node(0, 0); // dummy tail
        head.post = tail;
        tail.pre = head;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        // move the accessed node to the head;
        moveToHead(node);
        return node.value;
    }

    public void set(int key, int value) {

        Node node = cache.get(key);

        if(node == null){
            node = new Node(key, value);
            cache.put(key, node);
            addNode(node);
            count++;

            if (count > capacity) {
                // pop the tail
                Node tail = popTail();
                cache.remove(tail.key);
                count--;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

    private class Node {

        int key;
        int value;
        Node pre;
        Node post;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            pre = null;
            post = null;
        }
    }

    /**
     * Always add the new node right after head.
     */
    private void addNode(Node node){
        node.pre = head;
        node.post = head.post;
        head.post.pre = node;
        head.post = node;
    }

    /**
     * Remove an existing node from the linked list.
     */
    private void removeNode(Node node){
        Node pre = node.pre;
        Node post = node.post;
        pre.post = post;
        post.pre = pre;
    }

    /**
     * Move certain node in between to the head.
     */
    private void moveToHead(Node node){
        removeNode(node);
        addNode(node);
    }

    /**
     * pop the current tail.
     */
    private Node popTail(){
        Node node = tail.pre;
        removeNode(node);
        return node;
    }
}

