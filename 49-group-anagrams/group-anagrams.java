class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        boolean[] used = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (used[i]) continue;

            List<String> temp = new ArrayList<>();
            String str = strs[i];

            int[] freq1 = new int[26];

            for (char ch : str.toCharArray()) freq1[ch - 'a']++;

            temp.add(str);
            used[i] = true;

            for (int j = i + 1; j < strs.length; j++) {

                if (used[j]) continue;

                int[] freq2 = new int[26];

                for (char ch : strs[j].toCharArray()) freq2[ch - 'a']++;

                if (Arrays.equals(freq1, freq2)) {
                    temp.add(strs[j]);
                    used[j] = true;
                }
            }
            res.add(temp);
        }

        return res;
    }
}