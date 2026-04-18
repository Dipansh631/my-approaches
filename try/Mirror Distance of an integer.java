class Solution {
    public int mirrorDistance(int n) {
        int org=n;
        long rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return (int) Math.abs(org-rev);
    }
}
