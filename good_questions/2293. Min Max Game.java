class Solution {
    public int minMaxGame(int[] nums) {
        while(nums.length>1){
            int n=nums.length;
            int newnums[]=new int[n/2];
            for(int i=0;i<n/2;i++){
                int ist=nums[2*i]; //given
                int snd=nums[2*i+1];//given
                if(i%2==0){
                    newnums[i]=Math.min(ist,snd);
                }
                else{
                    newnums[i]=Math.max(ist,snd);
                }
            }
            nums=newnums;
        }
        return nums[0];
    }
}
