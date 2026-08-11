class Solution {

    boolean isValid(int[] nums, int divisor, int threshold){

        int sum = 0;

        for(int x : nums){

            sum += Math.ceil((double)x / divisor);

            if(sum > threshold) return false;
        }

        return true;
    }


    public int smallestDivisor(int[] nums, int threshold) {

        int l = 1;
        int r = 0;

        for(int x : nums) r = Math.max(r, x);

        int res = -1;

        while(l <= r){

            int mid = l + (r - l) / 2;

            if(isValid(nums, mid, threshold)){
                res = mid;
                r = mid - 1;
            }
            else l = mid + 1;
        }

        return res;
    }
}