class Solution {

    public int sum(List<Integer> arr){
        int sum = 0;
        for(int x : arr) sum += x;
        return sum;
    }

    public void backtrack(int[] candidates, int target, int idx, List<Integer> curr, List<List<Integer>> res){
        
        if(sum(curr) > target) return;
        if(sum(curr) == target){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = idx; i < candidates.length; i++){

            curr.add(candidates[i]);

            backtrack(candidates, target, i, curr, res);

            curr.remove(curr.size() - 1);
        }

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), res);

        return res;
    }
}