class Solution {

    public static boolean binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target)  return true;
            else if (arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        // Fails : Restriction 
        // for(int i = 0; i < matrix.length; i++) {
            
        //     if(target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
        //         if(binarySearch(matrix[i], target)) return true;
        //     }
        // }
        // return false;

        int top = 0, bottom = matrix.length - 1;

        while(top <= bottom){
            int row = bottom + (top - bottom)/2;

            if(target < matrix[row][0]) bottom = row - 1;
            else if(target > matrix[row][matrix[row].length - 1]) top = row + 1;
            else return binarySearch(matrix[row], target);
        }

        return false;
    }
}
