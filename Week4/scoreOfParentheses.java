public int scoreOfParentheses(String S) {
    if(S.length() % 2 != 0 || S == null){
        return 0;
    }
    
    Stack<String> stack = new Stack<>();
    int count = 0;
    
    for(int i = 0; i < S.length(); i++){
        if(S.charAt(i) == '('){
            stack.push("(");
        }
        else if(S.charAt(i) == ')'){
            if(stack.peek() == "(") {
                stack.pop();
                stack.push("1");
            }
            else{
                int n = 0;
                while(!stack.isEmpty() && stack.peek() != "(") {
                    n += Integer.parseInt(stack.pop());
                }
                stack.pop();
                stack.push(String.valueOf(n * 2));
            }
        }
    }
    
    while(!stack.isEmpty()) {
        count += Integer.parseInt(stack.pop());
    }

    return count;

}