public char findTheDifference(String s, String t) {
        
    int[] letters = new int[1 << 8];
    for(int i = 0; i<s.length(); i++){
        letters[s.charAt(i)] ++;
    }
    for(int i = 0; i<t.length(); i++){
        letters[t.charAt(i)] --;
    }
    for(int i = 0; i < letters.length; i++){
        if(letters[i] != 0){
            return (char) (i);
        }
    }
    return 0;
    
}