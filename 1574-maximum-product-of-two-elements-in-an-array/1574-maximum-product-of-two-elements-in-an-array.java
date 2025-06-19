class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        // int count = 0;
        // int val = 0;
        // for (int i=0;i<n-1;i++){
        //     for (int j=i+1;j<n;j++){
        //         if (nums[i] == nums[j]){
        //             val = nums[i];
        //             count++;
        //             System.out.print(count+" "+val);
        //         }
        //     }
        // }
        //System.out.print(count+" "+val);
        for (int i=0;i<n;i++){
            if (nums[i] > max){
                secondmax = max;
                max = nums[i];
            }
            
           else if 
            (nums[i] > secondmax){
                secondmax = nums[i];
            }
        }
       // System.out.print(secondmax);
        return (max - 1) * (secondmax - 1);
    }
}