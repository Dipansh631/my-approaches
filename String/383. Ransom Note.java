/////5ms
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] s1 = ransomNote.toCharArray();
        char[] s2 = magazine.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        int i = 0, j = 0;

        while (i < s1.length && j < s2.length) {

            if (s1[i] == s2[j]) {
                i++;
                j++;
            } else if (s1[i] > s2[j]) {
                j++;
            } else {
                return false;
            }
        }

        return i == s1.length;
    }
}

/////2ms
class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        
        for (char c : ransomNote.toCharArray()) {

            if (count[c - 'a'] == 0) {
                return false;
            }

            count[c - 'a']--;
        }

        return true;
    }
}


/////1ms
class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        int[] index = new int[26];
        for (char letter : magazine.toCharArray()) {
            index[letter - 'a']++;
        }
        for (char letter : ransomNote.toCharArray()) {
            if (index[letter - 'a']-- == 0) {
                return false;
            }
        }
        return true;
    }
