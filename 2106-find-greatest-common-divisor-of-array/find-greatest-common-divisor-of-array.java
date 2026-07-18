class Solution {

    //GCD
    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public int findGCD(int[] nums) {

       int min = nums[0], max = nums[0];

       for(int x : nums){

        if(min > x) min = x;
        if(max < x) max = x;
        
       }

        return gcd(min, max);

    }
}