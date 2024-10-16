class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        // Start binary search
        int left = 1, right = x, result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if mid * mid is equal to x
            if (mid == x / mid) {
                return mid;
            } 
            // If mid * mid is less than x, move to the right half
            else if (mid < x / mid) {
                result = mid;  // mid is a potential answer, but we look for higher values
                left = mid + 1;
            } 
            // If mid * mid is greater than x, move to the left half
            else {
                right = mid - 1;
            }
        }
        
        // Return the floor value of the square root
        return result;
    }
}
