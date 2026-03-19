class Solution {
    public int sumOfSquares(int n) {
        int num = 0; 
        while (n != 0) {
            int r = n % 10;        
            num +=Math.pow(r,2);          
            n /= 10;               
        }
        return num;
    }
    public boolean isHappy(int num) {
        Solution sol=new Solution(); 
        while(num!=1 && num!=4){
            num=sol.sumOfSquares(num);
        }
        return num==1;
    }
}
