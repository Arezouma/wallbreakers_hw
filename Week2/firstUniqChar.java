 public int firstUniqChar(String s) {
    int[] letters = new int[26];
    for(int i = 0; i < letters.length; i++){
        letters[i] = -1;
    }
    int i = 0;
    int min = Integer.MAX_VALUE;
    for(char c: s.toCharArray()) {   
        if(letters[c-'a'] != -1){
            letters[c-'a'] = Integer.MAX_VALUE;
        }
        else if(letters[c-'a'] == Integer.MAX_VALUE){
            i++;
            continue;
        }else{
            letters[c-'a'] = i;
        }
        i++;
    }
    
    for(int n: letters){
        if(n == -1) {
            continue;
        }
        
        min = Math.min(min, n);
        
    }
    return min == Integer.MAX_VALUE ? -1 : min;
}