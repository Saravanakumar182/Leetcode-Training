class Solution {
    public boolean isPalindrome(int x) {
            int temp=0;
            int a = x;
            while(x>0){
                temp = temp*10 + x%10;
                x/=10;
            }
            return temp==a;
            
        }
    }
