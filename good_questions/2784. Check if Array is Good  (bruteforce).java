class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        int max=0;
        int maxcount=0;
        for(int var: nums){
            max=Math.max(var,max);
        }
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        } 

        if(max+1==n){
            for(int i=0;i<n;i++){
                if(nums[i]==max){
                    maxcount++;
                    if(maxcount>2){
                        return false;
                    }
                }
            }
            if(maxcount==2){
                return true;
            }
        }
        return false;
    }
}
