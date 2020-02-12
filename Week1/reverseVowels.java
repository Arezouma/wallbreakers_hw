public String reverseVowels(String s) {
    String vowels = "aeiouAEIOU";
    char[] str = s.toCharArray();
    int i = 0, j = str.length-1;
    while(i < j){
            
        if(vowels.indexOf(str[i]) != -1 && vowels.indexOf(str[j]) != -1){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
            
        else if(i <= j && vowels.indexOf(str[i]) == -1 && vowels.indexOf(str[j]) != -1){
            i++;
        }
        else if(vowels.indexOf(str[i]) != -1 && vowels.indexOf(str[j]) == -1) {
            j--;
        }
        else {
            i++;
            j--;
        }
            
    }
        
    return new String(str);
}