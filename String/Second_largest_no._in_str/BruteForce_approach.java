import java.util.*;

class Solution {
    public int secondHighest(String s) {
        String result = s.replaceAll("[a-zA-Z]", "");
        
        if (result.length() < 2) return -1;

        char[] strnums = result.toCharArray();
        int[] nums = new int[strnums.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = strnums[i] - '0';
        }

        Arrays.sort(nums);

        int max = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != max) {
                return nums[i];
            }
        }

        return -1; 
    }
}
