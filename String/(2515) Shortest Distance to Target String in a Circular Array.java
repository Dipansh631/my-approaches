class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int diff = Math.abs(i - startIndex);
                int dist = Math.min(diff, n - diff);

                if (ans == -1 || dist < ans) {
                    ans = dist;
                }
            }
        }

        return ans;
    }
}
