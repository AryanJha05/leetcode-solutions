class Solution {

    public static void countingSort(int[] arr) {

        int max = 0;

        for (int num : arr) max = Math.max(max, num);

        int[] cnt = new int[max + 1];

        for (int num : arr) cnt[num]++;

        int idx = 0;

        for (int i = 0; i <= max; i++) {
            while (cnt[i] > 0) {
                arr[idx++] = i;
                cnt[i]--;
            }
        }
    }

    public int minimumPushes(String word) {
        int[] freq = new int[26];

        for (char ch : word.toCharArray()) freq[ch - 'a']++;

        countingSort(freq);

        int res = 0;

        for (int i = 25, idx = 0; i >= 0 && freq[i] > 0; i--, idx++) res += freq[i] * (idx / 8 + 1);

        return res;
    }
}
