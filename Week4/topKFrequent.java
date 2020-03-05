public List<Integer> topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    int max = 0;
    for(int i = 0; i < nums.length; i++){
        int freq = map.getOrDefault(nums[i], 0) + 1;
        map.put(nums[i], freq);
        max = Math.max(freq, max);
    }
    List<Integer>[] bucket = new List[max + 1];
    
    for(int key : map.keySet()) {
        int freq = map.get(key);
        if (bucket[freq] == null) {
            bucket[freq] = new ArrayList<>();
        }
        bucket[freq].add(key);
    }
    
    for(int i = bucket.length - 1; i >= 0 && k > 0; i--){
        if(bucket[i] != null){
            List<Integer> l = bucket[i];
            list.addAll(l);
            k -= l.size();
        }
    }
    return list;
}