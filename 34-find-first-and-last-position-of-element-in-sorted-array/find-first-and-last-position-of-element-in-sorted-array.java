class Solution {

    int binarySearch(int[] nums, int target, boolean findFirst){
        
        int l = 0, h = nums.length-1;
        int res = -1;

        while(l <= h){
            int mid = l + (h - l)/2;

            if(nums[mid] == target){

                res = mid;

                if(findFirst) h = mid - 1;
                else l = mid + 1;
            }else if(nums[mid] > target) h = mid - 1;
            else l = mid + 1;
        }

        return res;
    }

    public int[] searchRange(int[] nums, int target) {

        return new int[]{binarySearch(nums, target, true), binarySearch(nums, target, false)};
    }
}