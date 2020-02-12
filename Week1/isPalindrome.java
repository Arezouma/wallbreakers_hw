public boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
    int start = 0, end = s.length() -1;
    while(start <= end){
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        start++;
        end--;
            
    }
    return true;
        
}