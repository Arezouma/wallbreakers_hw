public String longestCommonPrefix(String[] strs) {
    if(strs == null || strs.length == 0){
        return "";
    }
        
    int k = 0;
    String result = "";
        
    for(char c : strs[0].toCharArray()){
        for(int i = 1; i < strs.length; i++){
            if(k >= strs[i].length() || c!= strs[i].charAt(k)){
                return result;
                    
            }
        }
        result += c;
        k++;

    }
        
    return result;
        
}