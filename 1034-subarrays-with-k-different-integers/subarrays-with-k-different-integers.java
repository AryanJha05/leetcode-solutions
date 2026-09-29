class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;

        int l = 0, cnt = 0, res = 0;

        int[] count = new int[n + 1];

        for(int r = 0; r < n; r++){
            count[nums[r]]++;
            if(count[nums[r]] == 1) k--;

            if(k < 0){
                count[nums[l]]--;
                l++;
                k++;
                cnt = 0;
            }

            if(k == 0){
                while(count[nums[l]] > 1){
                    count[nums[l]]--;
                    l++;
                    cnt++;
                }

                res  += (cnt + 1);
            }

        }

        return res;
    }
}