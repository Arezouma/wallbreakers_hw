public boolean wordPattern(String pattern, String str) {
    String[] stringArr = str.split(" ");
    if(stringArr.length != pattern.length()){
        return false;
    }
    Map<Character, String> map = new HashMap<>();
    
    for(int i = 0; i < pattern.length(); i++){
        char c = pattern.charAt(i);
        String st = stringArr[i];
        if(map.containsKey(c)){
            if(!st.equals(map.get(c))){
                return false;
            }
        }
        else{
            if(map.containsValue(st))
                return false;
            map.put(c,st);
        }
        
    }
    return true;