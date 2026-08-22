class Solution {

    public int sum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }

        return sum;
    }

    public int pdt(int n) {
        int pdt = 1;

        while (n > 0) {
            pdt *= (n % 10);
            n /= 10;
        }

        return pdt;
    }

    public boolean checkDivisibility(int n) {
        return (n % (sum(n) + pdt(n)) == 0);
    }
}