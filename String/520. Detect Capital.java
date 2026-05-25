class Solution {
    public boolean detectCapitalUse(String word) {
        StringBuilder sb = new StringBuilder(word);

        int upperCount = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (Character.isUpperCase(sb.charAt(i))) {
                upperCount++;
            }
        }

        if (upperCount == sb.length()) return true;
        if (upperCount == 0) return true;
        if (upperCount == 1 && Character.isUpperCase(sb.charAt(0))) return true; 

        return false;
    }
}
