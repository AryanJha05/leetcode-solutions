class Solution {
    public int minMoves(int[] nums) {
        
        int max = 0;

        for(int x : nums) max = Math.max(x, max);

        int res = 0;
        
        for(int x : nums) res += (max - x);

        return res;
    }
}