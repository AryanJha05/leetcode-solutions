class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = 0;
        for (int i =0 ;i<nums.length;i+=2) n += nums[i];

        int[] res = new int[n];
        int idx = 0;
        for (int i =0;i<nums.length;i+=2){
            Arrays.fill(res, idx, idx + nums[i], nums[i+1]);
            idx += nums[i];
        }
        return res;
    }
}