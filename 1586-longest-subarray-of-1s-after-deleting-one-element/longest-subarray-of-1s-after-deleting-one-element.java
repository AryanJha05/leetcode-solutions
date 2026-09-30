class Solution {
    public int longestSubarray(int[] nums) {
        
        int l = 0, zeros = 0, window = 0;

        for(int r = 0; r < nums.length; r++){

            if(nums[r] == 0) zeros++;

            while(zeros > 1){
                if(nums[l] == 0) zeros--;
                l++;
            }

            window = Math.max(window, r - l + 1);
        }

        return window - 1;
    }
}