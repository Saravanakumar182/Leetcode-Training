class Solution {
    public int addDigits(int num) {
        int sum=0;
        if(num<=9) return num;
        while(num>9){
            int a=num;
            sum=0;
            while(a>0){
                int r=a%10;
                sum+=r;
                a=a/10;
            }
            if(sum<=9) return sum;
            num=sum;
        }
        return sum;
    }
}