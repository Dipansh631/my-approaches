class Solution {
    public int heightChecker(int[] heights) {
        int count =0;
        int[] exp=Arrays.copyOf(heights,heights.length);
        Arrays.sort(exp);
        for(int i=0;i<heights.length;i++){
            
                if(heights[i]!=exp[i]){
                    count++;
                }
        }
        return count;
    }
}
