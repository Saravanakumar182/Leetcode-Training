class Solution {
    public boolean isHappy(int n) {
        int prod=1;
        List <Integer> list=new ArrayList<>();
        while(n>0){
            int a=n;
            int sum=0;
            while(a>0){
                int r=a%10;
                sum+=(r*r);
                a=a/10;
            }
            if(sum==1) return true;
            else if(list.contains(sum)) return false;
            list.add(sum);
            n=sum;
        }
        return false;
    }
}