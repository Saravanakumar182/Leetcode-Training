class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sb = new String(arr);
            if(!map.containsKey(sb)){
                map.put(sb,new ArrayList<>());
            }
            map.get(sb).add(str);
        }
        return new ArrayList<>(map.values());
    }
}