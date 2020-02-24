class MyHashMap {

    /** Initialize your data structure here. */
    private ArrayList<Node>[] bucket;
    private static final int CAPACITY = 1 << 8;
    int size = 0;
   
    public MyHashMap() {
        bucket = new ArrayList[CAPACITY];
        
    }
    
    private int hashCode(int key){
        return key % bucket.length;
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        Node node = new Node(key, value);
        int hashCode = hashCode(key);
        if(bucket[hashCode] == null){
            bucket[hashCode] = new ArrayList<>();
        }
        
        for(Node n : bucket[hashCode]){
            if(n.key == key){
                n.value = value;
                return;
            } 
        }
        
       bucket[hashCode].add(node); 
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int hashCode = hashCode(key);
        if(bucket[hashCode] == null) 
            return -1;
        for(Node n: bucket[hashCode]){
            if(n.key == key) {
                return n.value;
            }
        }
        return -1;
        
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int hashCode = hashCode(key);
        if(bucket[hashCode] == null){ 
            return;
        }
        
        int index = 0;
        
        for(Node n: bucket[hashCode]){
            if(n.key == key) {
                bucket[hashCode].remove(index);
                return;
            }
            index++;
        }
        
    }
    private class Node {
        int key, value;
        public Node (int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */