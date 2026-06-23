class Solution {
    public int lengthOfLastWord(String s) {
         String[] arr = s.trim().split("\\s+");
        
        int len = arr[arr.length-1].length();
        return len;
    }
}