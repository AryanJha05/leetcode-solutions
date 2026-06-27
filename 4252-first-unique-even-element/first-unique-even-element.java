class Solution {
    public int firstUniqueEven(int[] nums) {

        int n = nums.length;

        int[] freq = new int[101];
        for(int i : nums) freq[i]++;

        for(int i = 0; i < n; i++){
            int x = nums[i];
            if(x % 2 == 0 && freq[x] == 1) return x;
        }

        return -1;
    }
}