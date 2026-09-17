class Solution {
    public int lastRemaining(int n) {

        int first = 1;
        int gap = 1;
        boolean left = true;

        while (n > 1) {

            if (left || n % 2 == 1) first += gap;
            
            gap *= 2;

            n /= 2;

            left = !left;
        }

        return first;
    }
}