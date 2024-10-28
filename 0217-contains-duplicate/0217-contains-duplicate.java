class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> uniques = new HashSet<>();
        for (int i = 0; i<nums.length; i++){
            if (uniques.contains(nums[i])){
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
}