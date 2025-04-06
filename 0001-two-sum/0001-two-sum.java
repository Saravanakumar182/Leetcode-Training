class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sum = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int temp = target-nums[i];

            if(sum.containsKey(temp)) return new int[] {sum.get(temp),i};

            sum.put(nums[i],i);
        }

        return new int[] {0,0};
    }
}