class Solution {

    boolean isValid(int[] arr, int cap, int days){

        int d = 1;
        int w = 0;

        for(int x : arr){

            if(w + x > cap){
                d++;
                w = x;
            }
            else w += x;
        }

        return d <= days;
    }


    public int shipWithinDays(int[] weights, int days) {

        int l = 0, r = 0;

        for(int w : weights){
            l = Math.max(l, w);
            r += w;
        }


        int res = r;

        while(l <= r){

            int mid = l + (r - l) / 2;

            if(isValid(weights, mid, days)){
                res = mid;
                r = mid - 1; 
            }
            else l = mid + 1;
        }

        return res;
    }
}