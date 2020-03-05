class LRUCache {
    final int capacity;
    Map<Integer, ListNode> map;
    final ListNode head = new ListNode();
    final ListNode tail = new ListNode();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            ListNode n = map.get(key);
            removeFromCache(n);
            addToCache(n);
            return n.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            ListNode temp = map.get(key);
            temp.val = value;
            removeFromCache(temp);
            addToCache(temp);
        }else {
            if(map.size() == capacity) {
                map.remove(tail.prev.key);
                removeFromCache(tail.prev);
            }
            ListNode newNode = new ListNode(key,value);
            map.put(key,newNode);
            addToCache(newNode);	
        }
        
        
    }
    public void addToCache(ListNode node){
    
        ListNode curr = head.next;
        curr.prev = node;
        node.prev = head;
        node.next = curr;
        head.next = node;
    }
    
    public void removeFromCache(ListNode node){
        ListNode nodePre = node.prev;
	    ListNode nodeAfter = node.next;    
	    nodePre.next = nodeAfter;
	    nodeAfter.prev = nodePre;
        
    }
    
    private class ListNode {
        int key, val;
        ListNode next, prev;
        ListNode(int key, int val) { 
            this.key = key;
            this.val = val;
        }
        public ListNode(){}
    }
      
}