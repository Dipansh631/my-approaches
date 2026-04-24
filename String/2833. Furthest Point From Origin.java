class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0;
        int countR = 0;
        int countUnderline = 0;

        // Step 1: Count occurrences of each character
        for (char c : moves.toCharArray()) {
            if (c == 'L') {
                countL++;
            } else if (c == 'R') {
                countR++;
            } else {
                countUnderline++;
            }
        }

        // Step 2: The farthest distance is the net difference 
        // between L and R, plus all the flexible '_' moves.
        return Math.abs(countL - countR) + countUnderline;
    }
}
