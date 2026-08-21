class Solution {

    public int backtrack(int[] nums, int idx, int xor){
        if(idx == nums.length) return xor;

        int take = backtrack(nums, idx + 1, xor ^ nums[idx]);
        int skip = backtrack(nums, idx + 1, xor);

        return take + skip;
    }

    public int subsetXORSum(int[] nums) {
        return backtrack(nums, 0, 0);
    }
}