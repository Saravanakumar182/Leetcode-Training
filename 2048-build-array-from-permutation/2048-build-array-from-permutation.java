class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        int j = 0;
        for (int i=0;i<n;i++){
            res[j++] = nums[nums[i]];
        }
        return res;
    }
}