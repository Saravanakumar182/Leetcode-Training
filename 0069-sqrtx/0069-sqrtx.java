class Solution {
    public int mySqrt(int x) {
        int s=1,e=x;
        int res=0;
        if(x==0 || x==1) return x;
        while(s<=e){
            int mid = s+(e-s)/2;

            if((long)mid*mid==x) return mid;
            else if((long)mid*mid<x){
                res=mid;
                s=mid+1;
            }else e=mid-1;
        }

        return res;
    }
}