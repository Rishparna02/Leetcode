class Solution {
    public boolean isPalindrome(String s) {
        // Initialize two pointers
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Move the left pointer to the next alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move the right pointer to the previous alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            // Compare the characters at the left and right pointers
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            // Move both pointers inward
            left++;
            right--;
        }
        
        return true; // All characters matched, it's a palindrome
    }
}
