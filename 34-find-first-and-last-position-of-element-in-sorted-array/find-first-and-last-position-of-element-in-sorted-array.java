class Solution {

    public static int binaryLeft(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } 
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;

        }

        return ans;
    }

    public static int binaryRight(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } 
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        return new int[]{binaryLeft(nums, target), binaryRight(nums,target)};
    }
}