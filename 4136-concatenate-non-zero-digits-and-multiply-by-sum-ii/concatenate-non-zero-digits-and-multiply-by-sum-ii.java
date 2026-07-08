class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {

        int mod = 1_000_000_007;

        int n = s.length();

        int q = queries.length;

        // prefixSum[i] = sum of digits before index i
        long[] prefixSum = new long[n + 1];

        // count[i] = number of non-zero digits before index i
        int[] count = new int[n + 1];

        for (int i = 0; i < n; i++) {

            int digit = s.charAt(i) - '0';

            prefixSum[i + 1] = prefixSum[i] + digit;

            count[i + 1] = count[i];

            if (digit > 0)
                count[i + 1]++;
        }

        //Total Non-Zeros
        int k = count[n];

        // prefixNum for only non-zero digits
        long[] prefixNum = new long[k + 1];

        //power of 10
        long[] pow10 = new long[k+1];

        pow10[0] = 1;
        for(int i = 1; i <= k ; i++) pow10[i] = (pow10[i-1]*10)%mod;

        int idx = 0;
        //Building Prefix - Num using Non-Zeros digits:
        for(int i = 0; i < n; i++){
            int digit = s.charAt(i) - '0';

            if(digit > 0){
                idx++;
                prefixNum[idx] = (prefixNum[idx-1]*10 + digit)%mod;
            }
        }

        int[] res = new int[q];

        for(int i = 0; i < q; i++){

            int l = queries[i][0];
            int r = queries[i][1];

            //GET SUM : 
            long sum = prefixSum[r+1] - prefixSum[l];

            //GET X:

            int left = count[l];
            int right = count[r + 1];

            int len = right - left;

            long x = (  prefixNum[right] - (prefixNum[left] * pow10[len]) % mod + mod)%mod;

            res[i] = (int) ((sum * x) % mod);
        }
        return res;


    }
}