class Solution {
    public int reverseBits(int n) {
        String b=Integer.toBinaryString(n);
        while (b.length() < 32) {
            b = "0" + b;
        }
        String reversed = "";
        for(int i=b.length()-1;i>=0;i--){
            reversed+=b.charAt(i);
        }
        int a=(int)Long.parseLong(reversed,2);
        return a;
    }
}
