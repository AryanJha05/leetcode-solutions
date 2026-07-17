class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        double sum = 0;

        int i = 0;
        while(i < k)  sum += nums[i++];

        double maxAvg = sum / k;

        i = 1;
        while (i <= n - k) {

            sum -= nums[i - 1];

            sum += nums[i + k - 1];

            maxAvg = Math.max(maxAvg, sum / k);

            i++;
        }

        return maxAvg;
    }
}