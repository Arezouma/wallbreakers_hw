class MyStack {

    /** Initialize your data structure here. */
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();
    private int size;
    public MyStack() {
        size = 0;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue2.add(x);
        size++;
        while (!queue1.isEmpty()) { 
            queue2.add(queue1.peek()); 
            queue1.remove(); 
        } 
        Queue<Integer> q = queue1; 
        queue1 = queue2; 
        queue2 = q; 
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() { 
        size--;
        return queue1.poll();//queue1.remove();
    }
    
    /** Get the top element. */
    public int top() {
        if (queue1.isEmpty()){
            return -1;
        } 
                 
        return queue1.peek();
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}