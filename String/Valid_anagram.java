class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr2= t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        String snew = new String(arr);
        String tnew = new String(arr2);
        if(snew.equals(tnew)){
            return true;
        }
        return false;
    }
}
