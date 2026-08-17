class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0;

        for(int n = 1; res.size() < k; n++){
            if(i < arr.length && arr[i] == n) i++;
            else res.add(n);
        }

        return res.get(k - 1);
    }
}