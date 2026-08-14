class Solution {
    public int numOfSubarrays(int[] arr) {
        
        int MOD = 1_000_000_007;

        long even = 1;
        long odd = 0;

        long res = 0;
        int sum = 0;

        for(int x : arr){

            sum += x;

            if(sum % 2 == 0){
                res += odd;
                even++;
            }else{
                res += even;
                odd++;
            }

            res %= MOD;
        }

        return (int)res;

    }
}