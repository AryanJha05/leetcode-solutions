class Solution {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();

        if (s.length() < p.length()) return res;

        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (char ch : p.toCharArray()) pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        

        int k = p.length();

        int l = 0;

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (r - l + 1 > k) {

                char remove = s.charAt(l);

                window.put(remove, window.get(remove) - 1);

                if(window.get(remove) == 0) window.remove(remove);

                l++;
            }

            if (r - l + 1 == k && window.equals(pMap)) res.add(l);
        }

        return res;
    }
}