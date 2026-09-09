class Solution {
    public long countCommas(long n) {
        
        long res = 0;

        for(long p = 1000; p <= n; p *= 1000){

            res += n - p + 1;

            if (p > Long.MAX_VALUE / 1000) break;
            
        }

        return res;
    }
}