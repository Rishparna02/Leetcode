class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        // Process every 2k characters
        for (int i = 0; i < n; i += 2 * k) {
            // Calculate the end of the section to reverse
            int end = Math.min(i + k - 1, n - 1);
            reverse(chars, i, end);
        }

        return new String(chars);
    }

    // Helper method to reverse a portion of the array
    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}

