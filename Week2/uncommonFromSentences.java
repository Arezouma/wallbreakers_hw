public String[] uncommonFromSentences(String A, String B) {
        
    Map<String, Integer> map = new HashMap<>();
    Map<String, Integer> map2 = new HashMap<>();
    Set<String> ans = new HashSet();
    for(String str : A.split(" ")){
        Integer count = map.get(str);
        if (count == null) {
            map.put(str, 1);
        } else {
            map.put(str, ++count);
        }
    }
    for(String str : B.split(" ")){
        Integer count = map2.get(str);
        if (count == null) {
            map2.put(str, 1);
        } else {
            map2.put(str, ++count);
        }
    }
    for(Map.Entry<String, Integer> entry : map.entrySet()) {
        if (!map2.containsKey(entry.getKey()) && entry.getValue() == 1) {
            ans.add(entry.getKey());
        }
    }
    for(Map.Entry<String, Integer> entry : map2.entrySet()) {
        if (!map.containsKey(entry.getKey()) && entry.getValue() == 1) {
            ans.add(entry.getKey());
        }
    }
    return ans.toArray(new String[ans.size()]);
    
}