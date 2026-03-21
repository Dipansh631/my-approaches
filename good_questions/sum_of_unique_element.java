class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> seen = new HashMap<>();
        int sum = 0;
        for(int num : nums){
            seen.put(num, seen.getOrDefault(num,0)+1);
        }
        for(int num : nums){
            if(seen.get(num) == 1) sum += num;
        }
        return sum;
    }
}
