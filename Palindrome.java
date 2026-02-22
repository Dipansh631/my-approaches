class Solution {
    public boolean isPalindrome(int n) {
        int org=n;
        int temp=0;
        if(n<0){
            return false;
        }
        while(n!=0){
            int r= n%10;
            temp=temp*10+r;
            n/=10;
        }
        if(temp==org){
            return true;
        }
        else{
            return false;
        }
    }
}
