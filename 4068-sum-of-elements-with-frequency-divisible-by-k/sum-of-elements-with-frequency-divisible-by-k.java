class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int n = nums.length;

        int[] freq = new int[101];
        for(int i = 0; i < n; i++) freq[nums[i]]++;

        int sum = 0;
        for(int i : nums){
            if(freq[i] % k == 0) sum += i;
        }

        return sum;
    }
}