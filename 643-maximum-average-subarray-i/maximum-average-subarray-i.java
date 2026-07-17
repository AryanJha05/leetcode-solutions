class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int avg = 0;
        while (i < k) avg = avg + nums[i++];

        int max = avg;
        for (i = 0; i + k < n; i++) {
            avg = avg + nums[k + i] - nums[i];
            if (avg > max) max = avg;
        }
        return (double) max / k;
    }
}