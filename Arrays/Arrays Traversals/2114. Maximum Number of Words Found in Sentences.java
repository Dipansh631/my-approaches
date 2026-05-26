/////////////////4ms
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxcount=0;
        for(String s:sentences){
            int count=1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    count++;
                }
            }
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}

///////////////3ms
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxcount=0;
        for(String s:sentences){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    count++;
                }
            }
            maxcount=Math.max(count,maxcount);
        }
        return maxcount+1;
    }
}

/////////////2ms
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxcount=0;
        for(String s:sentences){
            int count=0;
            for(char c:s.toCharArray()){
                if(c==' '){
                    count++;
                }
            }
            maxcount=Math.max(count,maxcount);
        }
        return maxcount+1;
    }
}
