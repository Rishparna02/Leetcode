class Solution {
    Stack<Character> stack = new Stack<>();
    List<String> result = new ArrayList<>();

    private void backtrack(int openN, int closedN, int n){
        if(openN == closedN && closedN == n){
            StringBuilder sb = new StringBuilder();
            for(Character c : stack){
                sb.append(c);
            }
            result.add(sb.toString());
            return;
        }
        if(openN < n){
            stack.push('(');
            backtrack(openN + 1, closedN, n);
            stack.pop();
        }
        if(closedN < openN){
            stack.push(')');
            backtrack(openN, closedN + 1, n);
            stack.pop();
        }
    }
    public List<String> generateParenthesis(int n) {
        stack = new Stack<>();
        result = new ArrayList<>();

        backtrack(0, 0, n);
        return result;

    }
}