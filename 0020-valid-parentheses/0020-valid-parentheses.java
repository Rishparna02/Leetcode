class Solution { 
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check if it's a closing bracket and stack is empty, return false immediately
            if (stack.isEmpty() && (currentChar == ')' || currentChar == '}' || currentChar == ']')) {
                return false;
            }
            
            if (currentChar == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (currentChar == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (currentChar == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                // If it's an opening bracket or no match, push to stack
                stack.add(currentChar);
            }
        }

        // Return true if stack is empty (all brackets matched)
        return stack.isEmpty();
    }
}