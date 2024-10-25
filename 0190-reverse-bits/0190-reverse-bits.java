public class Solution {
    // Function to reverse bits of a 32-bit unsigned integer
    public int reverseBits(int n) {
        int result = 0;
        // Process each of the 32 bits
        for (int i = 0; i < 32; i++) {
            // Shift result left to make room for the next bit
            result <<= 1;
            // Add the least significant bit of n to the result
            result |= (n & 1);
            // Shift n right to process the next bit
            n >>= 1;
        }
        return result;
    }
}
