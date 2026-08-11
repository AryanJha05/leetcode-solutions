class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int[] freq = new int[nums.length + 1];
        for(int x : nums) freq[x]++;

        List<Integer> res = new ArrayList<>();
        for(int i = 1; i < freq.length; i++) if(freq[i] == 0) res.add(i);

        return res;
    }
}