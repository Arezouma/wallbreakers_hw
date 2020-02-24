public boolean isIsomorphic(String s, String t) {
    if(s.length() != t.length()){
        return false;
    }
    
    Map<Character, Character> map = new HashMap<>();
    Map<Character, Character> map2 = new HashMap<>();
    int i = 0, j = 0;

    while (i < s.length()) {
        char c1 = s.charAt(i++);
        char c2 = t.charAt(j++);

        if (map.containsKey(c1) && map.get(c1) != c2) 
          return false;

        if (map2.containsKey(c2) && map2.get(c2) != c1)
          return false;

        if (!map.containsKey(c1) && !map2.containsKey(c2)) {
          map.put(c1, c2);
          map2.put(c2, c1);
        }
    }

    return true;
}