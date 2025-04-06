class Solution {
    public String multiply(String num1, String num2) {
        int l1 = num1.length(),l2 = num2.length();
        int[] arr = new int[l1+l2];

        for(int i=l1-1;i>=0;i--){
            for(int j = l2-1; j>=0 ;j--){
                int v1  = num1.charAt(i) - '0';
                int v2  = num2.charAt(j) - '0';
                arr[i+j+1] += v1*v2;
            }
        }
        //System.out.print(Arrays.toString(arr));
        int c = 0 ; 
        for(int i=l1+l2-1; i>=0;i--){
            int temp = (arr[i]+c)%10;
            c = (arr[i]+c)/10;
            arr[i] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for(int n:arr){
            sb.append(n);
        }

        while(sb.length() !=1 && sb.charAt(0)=='0') sb.deleteCharAt(0);

        return sb.toString();
    }
}