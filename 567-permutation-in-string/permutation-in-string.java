class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;

        int[] freq = new int[26];
        for(char ch : s1.toCharArray()) freq[ch - 'a']++;

        int k = s1.length();

        int l = 0;

        for(int r = 0; r < s2.length(); r++){
            
            freq[s2.charAt(r) - 'a']--;

            if(r - l + 1 > s1.length()) freq[s2.charAt(l++) - 'a']++;

            if(r - l + 1 == s1.length()){
                boolean valid = true;

                for(int f : freq){
                    if(f != 0){
                        valid = false;
                        break;
                    }
                }

                if(valid) return true;
            }

        }

        return false;
    }
}