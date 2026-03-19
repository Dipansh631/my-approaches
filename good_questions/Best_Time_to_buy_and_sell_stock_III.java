class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int[] leftp=new int [n];
        int[] rightp=new int [n];
        int min =prices[0];
        for(int i=1;i<n;i++){
            min=Math.min(min,prices[i]);
            leftp[i]=Math.max(leftp[i-1],prices[i]-min);
        }
        int max=prices[n-1];
        for(int i=n-2;i>=0;i--){
            max=Math.max(max,prices[i]);
            rightp[i]=Math.max(rightp[i+1],max-prices[i]);
        }
        int maxprofit=0;
        for(int i=0;i<n;i++){
            maxprofit=Math.max(maxprofit,leftp[i]+rightp[i]);
        }
        return maxprofit;
    }
}
