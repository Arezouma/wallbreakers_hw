class MyHashSet {

    /** Initialize your data structure here. */
    private ArrayList<Integer>[] bucket;
    private static final int CAPACITY = 1 << 8;
    public MyHashSet() {
        bucket = new ArrayList[CAPACITY];
        
    }
    
    private int hashCode(int key){
        return key % bucket.length;
    }
    public void add(int key) {
        int hashCode = hashCode(key);
        if(bucket[hashCode] == null){
            bucket[hashCode] = new ArrayList<>();
        }
        if(!bucket[hashCode].contains(key)){
            bucket[hashCode].add(key);
        }
    }
    
    public void remove(int key) {
        int hashCode = hashCode(key);
        if(bucket[hashCode] == null) {
            return;
        }
        if(bucket[hashCode].indexOf(key) > -1) {
            bucket[hashCode].remove(bucket[hashCode].indexOf(key));
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hashCode = hashCode(key);
        if(bucket[hashCode] == null) return false;
        return bucket[hashCode].contains(key);
        
    }
}