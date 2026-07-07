class Solution {

    public static long reverse(long num) {
        long temp = 0;

        while (num > 0) {
            temp = (temp * 10) + num % 10;
            num /= 10;
        }

        return temp;
    }

    public long sumAndMultiply(int n) {

        int sum = 0;
        long num = 0;

        while (n > 0) {
            int ld = n % 10;

            sum += ld;

            if (ld != 0) num = (num * 10) + ld;

            n /= 10;
        }

        long nums = reverse(num);

        return nums * sum;
    }
}