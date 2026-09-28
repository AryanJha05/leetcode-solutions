/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    public static int findPeakElement(MountainArray mountainArr){
        int n = mountainArr.length();
        int l = 0, r = n - 1;

        while(l < r){
            int mid = l + (r - l)/2;

            if(mountainArr.get(mid) > mountainArr.get(mid + 1)) r = mid;
            else l = mid + 1;
        }

        return l;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int n = mountainArr.length();

        int peak = findPeakElement(mountainArr);

        int res = (mountainArr.get(peak) == target) ? peak : -1;

        if(res != -1) return res;

        int l = 0, r = peak - 1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(mountainArr.get(mid) == target) return mid;

            if(mountainArr.get(mid) < target) l = mid + 1;
            else r = mid - 1;
        }

        l = peak + 1;
        r = n - 1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(mountainArr.get(mid) == target) return mid;

            if(mountainArr.get(mid) > target) l = mid + 1;
            else r = mid - 1;
        }

        return -1;
    }
}