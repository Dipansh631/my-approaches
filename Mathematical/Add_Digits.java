class Solution {
    public int plusnum(int num){
        int n=0;
        while(num!=0){
            int r=num%10;
            n+=r;
            num/=10;
        }
        return n;
    }
    public int addDigits(int num) {
        while (num >= 10) {
            num = plusnum(num);
        }
        return num;
    }
}
