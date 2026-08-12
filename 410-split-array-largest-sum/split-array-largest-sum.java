class Solution {

    public boolean canSplit(int[] nums, int k, int maxSum) {

        int parts = 1;
        int sum = 0;

        for (int x : nums) {

            if (x > maxSum) return false;

            if (sum + x > maxSum) {
                parts++;
                sum = x;
            } else {
                sum += x;
            }
        }

        return parts <= k;
    }

    public int splitArray(int[] nums, int k) {

        int l = nums[0], r = 0;
        for (int x : nums) {
            l = Math.min(l, x);
            r += x;
        }

        int res = r;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (canSplit(nums, k, mid)) {
                res = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }

        return res;
    }
}