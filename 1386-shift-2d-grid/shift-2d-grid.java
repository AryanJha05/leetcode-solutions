class Solution {

    public static void reverse(int[] arr, int left, int right){

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }


    public static void rotate(int[] arr, int k){

        k %= arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }


    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int[] newArr = new int[m*n];

        int idx = 0;

        // 2D -> 1D : 
        for(int i = 0; i < m; i++) for(int j = 0; j < n; j++)  newArr[idx++] = grid[i][j];

        //Rotate K-times :
        rotate(newArr, k);


        // 1D -> List<List<Integer>> : 
        List<List<Integer>> res = new ArrayList<>();

        idx = 0;

        for(int i = 0; i < m; i++){

            List<Integer> row = new ArrayList<>();

            for(int j = 0; j < n; j++) row.add(newArr[idx++]);

            res.add(row);
        }

        return res;
    }
}