class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++) prefix[i] = prefix[i - 1] * nums[i];

        int[] suffix = new int[n];
        suffix[n-1] = nums[n-1];
        for(int i = n - 2; i >= 0; i--) suffix[i] = suffix[i + 1] * nums[i];

        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            int l = (i == 0) ? 1 : prefix[i - 1];
            int r = (i == (n-1)) ? 1 : suffix[i + 1];

            res[i] = l*r;
        }

        return res;
    }
}