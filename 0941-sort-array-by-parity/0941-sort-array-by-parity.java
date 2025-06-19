class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        List <Integer> list1 = new ArrayList<>();
        List <Integer> list2 = new ArrayList<>();
        for (int i=0;i<n;i++){
            if (nums[i] % 2 == 0){
list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }
        int [] res = new int[n];
        int j = 0;
        for (int k : list1){
res[j++] = k;
        }
         for (int m : list2){
res[j++] = m;
        }
        return res;
    }
}