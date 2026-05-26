///////////1ms
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int i=0 ;i<accounts.length ;i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum=sum+accounts[i][j];
            }
            max=Math.max(max, sum);
        }
        return max;
    }
}

///////////0ms
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=1;
        for (int i=0 ;i<accounts.length ;i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum=sum+accounts[i][j];
            }
            max=Math.max(max, sum);
        }
        return max;
    }
}
