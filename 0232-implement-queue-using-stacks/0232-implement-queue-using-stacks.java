class MyQueue {
    private Stack<Integer> input; // Instance variable for input stack
    private Stack<Integer> output; // Instance variable for output stack

    public MyQueue() {
        input = new Stack<>(); // Initialize the input stack
        output = new Stack<>(); // Initialize the output stack
    }
    
    public void push(int x) {
        // Move elements from input to output stack
        while (!input.empty()) {
            output.push(input.pop());
        }
        // Push the new element onto the input stack
        input.push(x);
        // Move elements back from output stack to input stack
        while (!output.empty()) {
            input.push(output.pop());
        }
        
        System.out.println("The element pushed is " + x);
    }
    
    public int pop() {
        if (input.empty()) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        }
        return input.pop(); // Pop and return the front element
    }
    
    public int peek() {
        if (input.empty()) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        }
        return input.peek(); // Return the front element without removing it
    }
    
    public boolean empty() {
        return input.empty(); // Check if the input stack is empty
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */