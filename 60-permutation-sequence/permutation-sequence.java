class Solution {

    public void backtrack(int n, boolean[] used, List<Integer> curr, List<List<Integer>> list){

        if(curr.size() == n){
            list.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 1; i <= n; i++){

            if(used[i]) continue;

            used[i] = true;
            curr.add(i);

            backtrack(n, used, curr, list);

            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }

    public String getPermutation(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        
        boolean[] used = new boolean[n + 1];

        backtrack(n, used, new ArrayList<>(), list);

        StringBuilder res = new StringBuilder();
        for(int x : list.get(k - 1)) res.append(x);

        return res.toString();
    }
}