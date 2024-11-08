import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);  // Step 1: Sort the array
        int closestSum = nums[0] + nums[1] + nums[2];  // Initialize closest sum with the first three elements
        
        // Step 2: Loop through each number in nums
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;          // Set the left pointer
            int right = nums.length - 1; // Set the right pointer
            
            // Step 3: Use the two-pointer technique to find the closest sum
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                // Step 4: Update the closest sum if the current one is closer to the target
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }
                
                // Move pointers based on comparison of currentSum and target
                if (currentSum < target) {
                    left++;  // Move left pointer right to increase the sum
                } else if (currentSum > target) {
                    right--; // Move right pointer left to decrease the sum
                } else {
                    return currentSum; // If exact target sum is found, return it immediately
                }
            }
        }
        
        return closestSum;  // Return the closest sum after checking all possibilities
    }
}
