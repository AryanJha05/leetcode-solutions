class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int[] lis = new int[nums.length];
        int size = 0;

        for(int x : nums){

            int l = 0, r = size;
            while(l < r){
                int mid = l + (r - l)/2;

                if(lis[mid] < x) l = mid + 1;
                else r = mid;
            }

            lis[l] = x;
            if(l == size) size++;
        }

        return size;
    }
}