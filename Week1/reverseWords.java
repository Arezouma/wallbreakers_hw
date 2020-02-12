public String reverseWords(String s) {
    
    StringBuilder sb = new StringBuilder();

    for(String str : s.split(" ")){
        sb.append(new StringBuilder(str).reverse());
        sb.append(" ");
    }

    return sb.toString().trim();
        
}