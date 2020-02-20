 public int numJewelsInStones(String J, String S) {
    if(J == null || J.length() == 0 || S == null || S.length()== 0){
        return 0;
    }
    int counter = 0;
    Set<Character> set = new HashSet<>();
    for(int i = 0; i < J.length(); i++){
        set.add(J.charAt(i));
    }
    for(int j = 0; j < S.length(); j++){
        if(set.contains(S.charAt(j))){
            counter++;
        }
    }
    return counter;
    
}