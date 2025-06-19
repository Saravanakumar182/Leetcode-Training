class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        //int [] res = new int[n];
        Map <Integer, Integer> map = new HashMap<>();
        for (int k : nums){
            map.put(k, map.getOrDefault(k,0)+1);
        }
        Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA != freqB) {
                return freqA - freqB;
            } else {
                return b - a;
            }
        
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = boxed[i];
        }

        return nums;
    }
}
    
