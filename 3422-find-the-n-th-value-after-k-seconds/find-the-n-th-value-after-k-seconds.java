class Solution {
    public int valueAfterKSeconds(int n, int k) {
        
        int mod = 1_000_000_007;
        int[] arr = new int[n];

        Arrays.fill(arr, 1);

        for(int i = 0; i < k; i++) for(int j = 1; j < n; j++) arr[j] = (arr[j] + arr[j-1]) % mod;

        return arr[n-1];
    }
}