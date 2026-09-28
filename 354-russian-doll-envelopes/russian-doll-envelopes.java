class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        
        Arrays.sort(envelopes,(a, b) -> {
            if(a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });

        int[] lis = new int[envelopes.length];
        int size = 0;

        for(int[] envelope : envelopes){

            int h = envelope[1];

            int l = 0, r = size;
            while(l < r){
                int mid = l + (r - l)/2;

                if(lis[mid] < h) l = mid + 1;
                else r = mid;
            }

            lis[l] = h;

            if(l == size) size++;
        }
        
        return size;
    }
}