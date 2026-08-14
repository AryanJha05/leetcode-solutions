class Solution {
    public boolean isValid(int[] pos, int f, int m){
        int cnt = 1;

        int prev = pos[0];
        for(int i = 1; i < pos.length; i++){
            if(Math.abs(pos[i] - prev) >= f){
                cnt++;
                prev = pos[i];
            }
        }
        return cnt >= m;
    }
    public int maxDistance(int[] pos, int m) {
        
        int n = pos.length;

        Arrays.sort(pos);
        int min = 1, max = (pos[n - 1] - pos[0]);

        int res = -1;
        while(min <= max){
            int mid = min + (max - min)/2;

            if(isValid(pos, mid, m)){
                res = mid;
                min = mid + 1;
            } else max = mid - 1;
        }

        return res;
    }
}