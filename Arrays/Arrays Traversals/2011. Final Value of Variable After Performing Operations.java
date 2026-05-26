//////1ms
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String op:operations){
            if(op.contains("+"))x++;
            else{x--;}
        }
        return x;
    }
}

///////0ms
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
             if(operations[i].charAt(1) =='+') {
                x++;
            }
            else {
                x--;
            }
        }
        return x;
    }
}
