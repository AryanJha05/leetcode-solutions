class Solution {

    public static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    public int gcdOfOddEvenSums(int n) {
        int oddSum = n * n;
        int evenSum = n * (n + 1);

        return gcd(oddSum, evenSum);
    }
}