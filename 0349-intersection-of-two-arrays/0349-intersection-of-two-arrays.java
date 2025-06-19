class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> list = new HashSet<>();
        for (int i=0;i<nums1.length;i++){
            for (int j=0;j<nums2.length;j++){
                if (nums1[i] == nums2[j]){
                    list.add(nums2[j]);
                }
            }
        }
        int [] res = new int[list.size()];
        int m = 0;
        for (int k : list){
            res[m++] = k;
        }
        return res;
    }
}