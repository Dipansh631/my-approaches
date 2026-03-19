class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int elem:nums){
            result^=elem;
        }
        return result;
    }
}
/* num= [4,1,2,1,2]
XOR with 4 → result becomes 4.
XOR with 1 → result becomes 5.
XOR with 2 → result becomes 7.
XOR with 1 again → cancels out the earlier 1.
XOR with 2 again → cancels out the earlier 2.
result=4*/
