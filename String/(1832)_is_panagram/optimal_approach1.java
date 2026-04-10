class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean isPangram=true;
        
        for(char ch='a'; ch<='z'; ch++){
            if(sentence.indexOf(ch)==-1){
                isPangram=false;
                break;
            }
        }
        return isPangram;
    }
}
