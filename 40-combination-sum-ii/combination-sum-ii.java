class Solution {

    public void backtrack(int[] arr, int target, int idx, List<Integer> curr, List<List<Integer>> res){

        if(target < 0) return;
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = idx; i < arr.length; i++){

            if(i > idx && arr[i] == arr[i - 1]) continue;
            if(arr[i] > target) break;

            curr.add(arr[i]);

            backtrack(arr, target - arr[i], i + 1, curr, res);

            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, target, 0, new ArrayList<>(), res);

        return res;
    }
}