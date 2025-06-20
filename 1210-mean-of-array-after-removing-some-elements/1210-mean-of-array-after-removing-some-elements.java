import java.util.Arrays;

class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        int trim = l / 20;  // Number of elements to remove from each end
        double sum = 0.0;
        
        for (int i = trim; i < l - trim; i++) {
            sum += arr[i];
        }
        
        return sum / (l - 2 * trim);
    }
}
