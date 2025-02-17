public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for nums1, nums2, and the merged array
        int p1 = m - 1;  // last element in the non-zero part of nums1
        int p2 = n - 1;  // last element in nums2
        int p = m + n - 1;  // last position in nums1

        // Merge the arrays from the end
        while (p1 >= 0 && p2 >= 0) {
            // Compare the elements from the end and place the larger one
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are remaining elements in nums2, copy them
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
