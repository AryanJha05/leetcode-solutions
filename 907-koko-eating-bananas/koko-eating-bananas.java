class Solution {

    boolean canEat(int[] piles, int h, int speed){

        int hrs = 0;

        for(int p : piles){
            
            hrs += Math.ceil((double)p / speed);

            if(hrs > h) return false;
        }

        return true;
    }
    
    public int minEatingSpeed(int[] piles, int h) {

        // Maximize the Minimum :

        //         Speed k:
        // 1  2  3  4  5  6  7 ...
        // F  F  F  T  T  T  T

        int l = 1, r = 0;
        for(int p : piles) r = Math.max(r, p);

        int res = 0;

        while(l <= r){
            int mid = l + (r - l)/2;

            if(canEat(piles, h, mid)){
                res = mid;
                r = mid - 1;
            }else l = mid + 1;
        }

        return res;
    }
}