class Solution {
    public int[] leftRightDifference(int[] nums) {
        

        int tSum = 0;
        for(int x : nums) tSum += x;

        int leftSum = 0;

        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++){

            int rightSum = tSum - leftSum - nums[i];

            res[i] = (int)Math.abs(leftSum - rightSum);

            leftSum += nums[i];
        }

        return res;
    }
}