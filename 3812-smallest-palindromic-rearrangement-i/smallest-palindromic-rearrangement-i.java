class Solution {
    public String smallestPalindrome(String s) {
        
        int[] freq = new int[26];
        for(char ch : s.toCharArray()) freq[ch - 'a']++;

        int mid = -1;
        StringBuilder firstHalf = new StringBuilder();

        for(int i = 0; i < 26; i++){

            for(int j = 0; j < freq[i]/2; j++) firstHalf.append((char)('a' + i));

            if(freq[i] % 2 == 1) mid = i;
        }

        StringBuilder res = new StringBuilder();
        res.append(firstHalf.toString());

        if(mid != -1) res.append((char)('a' + mid));

        res.append(firstHalf.reverse().toString());

        return res.toString();

    }
}