class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int result = 0, remainder;

        if (x < 0) return false;

        while(temp != 0){
            remainder = temp%10;
            result = result*10 + remainder;
            temp /= 10;
        }

        return result == x;
    }
}