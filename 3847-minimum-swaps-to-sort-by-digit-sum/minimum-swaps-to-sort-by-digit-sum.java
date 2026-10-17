class Solution {

    public int digitSum(int n){
        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public int minSwaps(int[] nums) {
        
        int n = nums.length;

        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = digitSum(nums[i]);
            arr[i][1] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            if(a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        HashMap<Integer, Integer> pos = new HashMap<>();
        for(int i = 0; i < n; i++) pos.put(arr[i][1], i);

        boolean[] vis = new boolean[n];

        int swaps = 0;

        for(int i = 0; i < n; i++){

            if(vis[i]) continue;

            int j = i;
            int cycle = 0;

            while(!vis[j]){
                vis[j] = true;
                j = pos.get(nums[j]);
                cycle++;
            }

            swaps += (cycle - 1);
        }

        return swaps;
    }
}