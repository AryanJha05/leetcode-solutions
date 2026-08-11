class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String[] arr = paragraph.toLowerCase().split("\\W+");

        HashMap<String, Integer> map = new HashMap<>();
        for(String word : arr) map.put(word, map.getOrDefault(word, 0) + 1);

        HashSet<String> set = new HashSet<>();
        for(String word : banned) set.add(word);

        String res = "";
        int max = 0;

        for(String word : map.keySet()) {

            if(!set.contains(word) && map.get(word) > max) {
                max = map.get(word);
                res = word;
            }
        }

        return res;
    }
}