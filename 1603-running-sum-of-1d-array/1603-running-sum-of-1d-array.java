class Solution {
    public int[] runningSum(int[] nums) {
        int  n = nums.length;
        int [] res = new int[n];
        int j = 0;
        int sum = 0;
        for (int i=0;i<n;i++){
sum += nums[i];
res[j++] = sum;
        }
        return res;
    }
}