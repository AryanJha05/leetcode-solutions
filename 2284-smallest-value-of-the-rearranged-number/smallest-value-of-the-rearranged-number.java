class Solution {
    public long smallestNumber(long num) {

        if (num == 0)
            return 0;

        boolean negative = num < 0;

        char[] arr = String.valueOf(Math.abs(num)).toCharArray();

        Arrays.sort(arr);

        //Negative:
        if (negative) {
            // Reverse ascending order -> descending
            int l = 0, r = arr.length-1;

            while (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                l++;
                r--;
            }

            return -Long.parseLong(new String(arr));
        }

        //Positive:

        int i = 0;
        while (arr[i] == '0') i++;

        char temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        return Long.parseLong(new String(arr));

    }
}