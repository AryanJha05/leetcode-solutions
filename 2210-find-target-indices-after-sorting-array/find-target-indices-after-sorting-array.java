class Solution {
    public static void insertionSort(int[] arr){
        
        int n = arr.length;
        
        for(int i = 1; i < n; i++){
            int key = arr[i];
            
            int j = i-1;
            
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = key;
        }
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> res = new ArrayList<>();

        insertionSort(nums);

        for(int i = 0; i < nums.length; i++) if(nums[i] == target) res.add(i);

        return res;
        
    }
}