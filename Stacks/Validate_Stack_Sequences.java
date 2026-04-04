class Solution {
    public boolean validateStackSequences(int[] ph, int[] pp) {
        Stack<Integer> st=new Stack<>();
        int j=0;
        for(int i=0;i<ph.length;i++){
            st.push(ph[i]);
            while (!st.isEmpty() && st.peek() == pp[j]) {
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}
