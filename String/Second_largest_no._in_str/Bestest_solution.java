class Solution {
    public int secondHighest(String s) {
        int count = 0;

        for (char c = '9'; c >= '0'; c--) {
            if (s.indexOf(c) != -1) {
                count++;
                if (count == 2) {
                    return c - '0';
                }
            }
        }

        return -1;
    }
}
