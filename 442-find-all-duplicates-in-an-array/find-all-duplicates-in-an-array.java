class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int mx = 0;
        for(int x : nums) mx = Math.max(mx, x);

        int[] freq = new int[mx + 1];
        for(int x:  nums) freq[x]++;

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < freq.length; i++) if(freq[i] > 1) res.add(i);

        return res;
    }
}