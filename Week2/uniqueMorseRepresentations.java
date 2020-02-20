public int uniqueMorseRepresentations(String[] words) {
    Set<String> set = new HashSet<>();
    String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    for(String str : words){
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            sb.append(morseCodes[c - 'a']);
        }
        set.add(sb.toString());
    }
    return set.size();
}