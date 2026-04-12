class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int respos=0;
        int resneg=0;
        int [] maximum=new int[3];
        int idx = 0;
        for (int i = nums.length - 1; i >= nums.length - 3; i--) {
            maximum[idx++] = nums[i];
            }
        respos=maximum[0]*maximum[1]*maximum[2];
        resneg=nums[0]*nums[1]*nums[nums.length-1];
        return Math.max(respos,resneg);
    }
}
