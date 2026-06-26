class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        int[] pre = new int[2 * n + 1];
        pre[n] = 1;

        int cnt = n;
        long ans = 0;
        long preSum = 0;

        for (int num : nums) {
            if (num == target) {
                preSum += pre[cnt];
                cnt++;
                pre[cnt]++;
            } else {
                cnt--;
                preSum -= pre[cnt];
                pre[cnt]++;
            }

            ans += preSum;
        }

        return ans;
    }
}