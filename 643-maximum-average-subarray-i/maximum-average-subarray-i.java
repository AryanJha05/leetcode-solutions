class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        double sum = 0;

        for(int i = 0; i < k; i++) sum += nums[i];

        double maxAvg = sum;

        for(int i = k; i < n; i++){

            sum += nums[i];
            sum -= nums[i-k];

            maxAvg = Math.max(maxAvg, sum);
        }

        
        return maxAvg/k;
    }
}