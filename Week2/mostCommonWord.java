public String mostCommonWord(String paragraph, String[] banned) {
    Map.Entry<String, Integer> max = null;
    Map<String, Integer> map = new HashMap<>();
    String[] par = paragraph.toLowerCase().replaceAll("[^a-z ]", " ").replace("  ", " ").split(" ");
    for(String s : par){
        map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
    }
    for(String str : banned){
        if (map.containsKey(str)){
            map.remove(str);
        }
    }
    for(Map.Entry<String, Integer> entry : map.entrySet()){
        if(max == null || entry.getValue().compareTo(max.getValue()) > 0){
            max = entry;
            
        }
    }
    return max.getKey();
    
}