class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            int k = 0;
            for(int j = i; j < n; j++){
                if(nums[j] == target) k++;

                int len = j - i + 1;

                if(k > len/2) ans++;
            }
        }
        return ans;
    }
}