class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String token : operations) {
            if (token.equals("C")) {
                st.pop();
            }
            else if (token.equals("D")) {
                st.push(st.peek() * 2);
            }
            else if (token.equals("+")) {
                int d1 = st.pop();
                int d2 = st.peek();
                st.push(d1);
                st.push(d1 + d2);
            }
            else {
                st.push(Integer.parseInt(token));
            }
        }
        int sum = 0;
        for (int x : st) {
            sum += x;
        }
        return sum;
    }
}
