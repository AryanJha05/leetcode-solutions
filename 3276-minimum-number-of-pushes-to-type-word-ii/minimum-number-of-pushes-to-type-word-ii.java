class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];

        for (char ch : word.toCharArray()) freq[ch - 'a']++;

        Arrays.sort(freq);

        int res = 0;

        for (int i = 25, idx = 0; i >= 0 && freq[i] > 0; i--, idx++) res += freq[i] * (idx / 8 + 1);


        return res;
    }
}