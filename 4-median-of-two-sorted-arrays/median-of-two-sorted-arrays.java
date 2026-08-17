class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int m = nums2.length;

        int t = n + m;

        int i = 0, j = 0;

        int prev = 0, curr = 0;

        for(int cnt = 0; cnt <= t/2; cnt++){

            prev = curr;

            if(i < n && (j >= m || nums1[i] <= nums2[j])){
                curr = nums1[i];
                i++;
            }else{
                curr = nums2[j];
                j++;
            }
        }

        if(t % 2 == 0) return (prev + curr)/2.0;

        return curr;

    }
}