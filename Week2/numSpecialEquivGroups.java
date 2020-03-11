public int numSpecialEquivGroups(String[] A) {
    
    Set<String> set = new HashSet<>();
    
    for(String str : A){
        int[] even = new int[26];
        int[] odd = new int[26];
        for(int i = 0; i < str.length(); i++){
            if(i % 2 == 0){
                even[str.charAt(i)-'a']++;
            }
            else{
                odd[str.charAt(i)-'a']++;
            }
        }
        set.add(Arrays.toString(even) + Arrays.toString(odd));
    }
    return set.size();
}