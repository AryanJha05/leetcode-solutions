class Solution {
    public boolean checkIfPangram(String sentence) {

        // int[] freq = new int[26];

        // for (int i = 0; i < sentence.length(); i++) {
        //     char ch = sentence.charAt(i);
        //     freq[ch - 'a']++;
        // }

        // for (int count : freq)  if (count == 0) return false;

        // return true;

        String a="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<a.length();i++) if(!sentence.contains(a.charAt(i) + "")) return false;
        return true;
    }
}