class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        List<Integer> res = new ArrayList<>();
        if (n == 0) return res;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums)  map.put(x, map.getOrDefault(x, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) if(entry.getValue() > (n/3)) res.add(entry.getKey());
        
        return res;
    }
}
