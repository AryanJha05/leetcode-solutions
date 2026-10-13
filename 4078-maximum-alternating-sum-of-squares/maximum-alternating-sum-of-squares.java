class Solution {
    public long maxAlternatingSum(int[] nums) {
       
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (a, b) -> Long.compare(Math.abs((long) a), Math.abs((long) b)));

        int n = nums.length;
        long res = 0;

        for(int i = 0; i < n; i++){

            if(i < n / 2){
                long x = Math.abs((long) arr[i]);
                res -= (x * x);
            }
            else{
                long x = Math.abs((long) arr[i]);
                res += (x * x);
            }
            
        }

        return res;
    }
}