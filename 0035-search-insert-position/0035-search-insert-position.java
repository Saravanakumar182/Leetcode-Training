class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= target) {
                return i; // either found or correct insert position
            }
        }
        return n; // target is greater than all elements, insert at the end
    }
}
