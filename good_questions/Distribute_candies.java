class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> myset =new HashSet<>();
        for(int var:candyType){
            myset.add(var);
        }
        return Math.min(myset.size(),candyType.length/2);
    }
}
