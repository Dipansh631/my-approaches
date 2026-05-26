class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(String.valueOf(nums[i]).length()%2==0){
                count++;
            }
        }
        return count;
    }
}

////////////////////////////////////////////////////////////////////////OR////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {

            int digitCount = 0;

            int temp = num;
            
            while (temp != 0) {
                digitCount++;
                temp = temp / 10;
            }

            if (digitCount % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
