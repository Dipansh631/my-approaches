class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        for(char c='a';c<='z';c++){
            int small=word.lastIndexOf(c);
            int big=word.indexOf(Character.toUpperCase(c));

            if(small !=-1 && big !=-1 && small<big){
                count++;
            }
        }
        return count;
    }
}
