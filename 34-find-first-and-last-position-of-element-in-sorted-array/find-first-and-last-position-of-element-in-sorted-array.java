class Solution {

    int lowerBound(int[] nums, int target) {
        int low = 0, high = nums.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < target) low = mid + 1;
            else high = mid;
        }

        return low;
    }

    int upperBound(int[] nums, int target) {
        int low = 0, high = nums.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= target) low = mid + 1;
            else high = mid;
        }

        return low;
    }

    public int[] searchRange(int[] nums, int target) {

        int first = lowerBound(nums, target);

        if (first == nums.length || nums[first] != target) return new int[]{-1, -1};

        int last = upperBound(nums, target) - 1;

        return new int[]{first, last};
    }
}