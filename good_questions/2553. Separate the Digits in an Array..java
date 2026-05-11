class Solution {
    public int[] separateDigits(int[] nums) {
         int total = 0;

        for (int num : nums) {

            while (num > 0) {
                total++;
                num /= 10;
            }
        }

        int[] rez = new int[total];
        int idx = total - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];

            while (num != 0) {
                rez[idx--] = num % 10;
                num /= 10;
            }
        }

        return rez;
    }
}





/////////////////////////////////////////////////////////////////////////////OR////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            String s = String.valueOf(num);

            for (char ch : s.toCharArray()) {
                list.add(ch - '0');
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
