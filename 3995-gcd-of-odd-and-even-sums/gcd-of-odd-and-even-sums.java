class Solution {

    public static int gcd(int a, int b){
        if(a == 0) return b;

        return gcd(b%a, a);
    }
    public int gcdOfOddEvenSums(int n) {
        
        int odd = 1, even = 2, oddSum = 1, evenSum = 2;


        for(int i = 1; i < n; i++){

            odd += 2;
            even += 2;

            oddSum += odd;
            evenSum += even;
        }

        return gcd(oddSum, evenSum);
    }
}