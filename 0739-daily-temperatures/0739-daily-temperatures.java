class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int curDay = 0; curDay < temperatures.length; curDay++){
            while(!stack.isEmpty() && temperatures[curDay] > temperatures[stack.peek()] ){
                int prevDay = stack.pop();
                ans[prevDay] = curDay - prevDay;
            }
            stack.add(curDay);
        }
        return ans;
    }
}