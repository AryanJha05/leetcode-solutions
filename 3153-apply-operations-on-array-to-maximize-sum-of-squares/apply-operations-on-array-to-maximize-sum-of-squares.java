class Solution {
    public int maxSum(List<Integer> nums, int k) {
        
        int MOD = 1_000_000_000 + 7;
        int[] bits = new int[31];

        for(int n : nums) for(int b  = 0; b < 31; b++) if((n & (1 << b)) != 0) bits[b]++;

        long res = 0;

        for(int i = 0; i < k; i++){
            long num = 0;
            for(int b  = 0; b < 31; b++){

                if(bits[b] > 0){
                    num |= (1 << b);
                    bits[b]--;
                }
            }

            res = (res + (num * num)) % MOD;
        }

        return (int) res;
    }
}