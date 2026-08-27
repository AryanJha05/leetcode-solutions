class Solution {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();

        if (s.length() < p.length()) return res;

        HashMap<Character, Integer> pMap = new HashMap<>();
        for (char ch : p.toCharArray()) pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);

        int k = p.length();
        int l = 0;
        int cnt = k;

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);

            if (pMap.containsKey(ch)) {
                if (pMap.get(ch) > 0) cnt--;

                pMap.put(ch, pMap.get(ch) - 1);
            }

            if (r - l + 1 > k) {
                char remove = s.charAt(l);
                if (pMap.containsKey(remove)) {
                    pMap.put(remove, pMap.get(remove) + 1);

                    if (pMap.get(remove) > 0) cnt++;
                }

                l++;
            }

            if (cnt == 0) res.add(l);
        }

        return res;
    }
}