class Solution {
    public int generateKey(int num1, int num2, int num3) {

        int res = 0;
        int place = 1;

        for (int i = 0; i < 4; i++) {

            int x = num1 % 10;
            int y = num2 % 10;
            int z = num3 % 10;

            int to = Math.min(x, Math.min(y, z));

            res += to * place;

            place *= 10;

            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }

        return res;
    }
}