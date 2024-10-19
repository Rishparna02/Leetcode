class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        // Initialize the base cases
        int prev2 = 1;  // ways to climb 1 step
        int prev1 = 2;  // ways to climb 2 steps

        // Start from step 3 up to n
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;  // Current step is the sum of the previous two
            prev2 = prev1;  // Shift the values for next iteration
            prev1 = current;
        }

        return prev1;
    }
}