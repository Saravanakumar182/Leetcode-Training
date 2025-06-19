class Solution {
    public int xorOperation(int n, int start) {
        int res[] = new int[n];
        int j = 0;
        for (int i=0;i<n;i++){
            res[j++] = start + 2 * i;
        }
    int ans = 0;
    for (int i=0;i<n;i++){
        ans = ans ^ res[i];
    }
        return ans;
    }
}