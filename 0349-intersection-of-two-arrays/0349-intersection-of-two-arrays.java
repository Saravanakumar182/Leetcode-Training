class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n2;i++){
            for(int j=0;j<n1;j++){
                if(nums2[i]==nums1[j]){
                    list.add(nums2[i]);
                }
            }
        }
        Set<Integer> set=new HashSet<>();
        for(int i:list){
            set.add(i);
        }
        int l=set.size();
        int[] arr=new int[l];
        int j=0;
        for(int i:set){
            arr[j++]=i;
        }
        return arr;
    }
}