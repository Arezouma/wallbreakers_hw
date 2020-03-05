public boolean backspaceCompare(String S, String T) {
    Stack<Character> stackS = new Stack<>();
    Stack<Character> stackT = new Stack<>();
    for(int i = 0; i < S.length(); i++){
        if(S.charAt(i) == '#'){
            if(!stackS.isEmpty()){
                stackS.pop();
            }
            
        }
        else{
            stackS.push(S.charAt(i));
        }
    }
    for(int i = 0; i < T.length(); i++){
        if(T.charAt(i) == '#'){
            if(!stackT.isEmpty()){
                stackT.pop();
            }
        }
        else{
            stackT.push(T.charAt(i));
        }
    }
    if(stackS.equals(stackT)){
        return true;
    }
    return false;
}