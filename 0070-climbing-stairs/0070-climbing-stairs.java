class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;

        int a=0;
        int b=1;

        while(n>0){
            int c=a+b;
            a=b;
            b=c;
            n--;
        }
        return b;
    }
}