class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long k = (long) k1 + k2;
        int[] freq = new int[100001];
        int max = 0;

        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
            max = Math.max(max, diff);
        }

        while (k > 0 && max > 0) {
            if (freq[max] <= k) {
                k -= freq[max];
                freq[max - 1] += freq[max];
                freq[max] = 0;
                max--;
            } else {
                int moves = (int) k;
                freq[max] -= moves;
                freq[max - 1] += moves;
                k = 0;
            }
        }

        long res = 0;

        for (int d = 1; d <= max; d++) res += (long) d * d * freq[d];

        return res;
    }
}