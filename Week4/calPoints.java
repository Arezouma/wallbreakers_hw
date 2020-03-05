public int calPoints(String[] ops) {
    Stack<Integer> stack = new Stack<>();
    int sum = 0;
    
    for (String str : ops) {
        if(str.equals("C")){
            stack.pop();
        }
        else if(str.equals("D")) {
               stack.push(stack.peek() * 2);
        }
        else if(str.equals("+")) {
            int end = stack.pop();
            int top = stack.peek();
            stack.push(end);
            stack.push(end + top);
                
        }
        else {
            stack.push(Integer.parseInt(str));
        }
    }

    while(!stack.isEmpty())
        sum += stack.pop();
    
    return sum;
}