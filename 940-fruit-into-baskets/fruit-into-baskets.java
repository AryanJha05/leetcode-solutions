class Solution {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int l = 0, res = 0;

        for(int r = 0; r < fruits.length; r++){

            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            while(map.size() > 2){
                int x = fruits[l];

                map.put(x,map.get(x) - 1);

                if(map.get(x) == 0) map.remove(x);

                l++;            
            }

            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}