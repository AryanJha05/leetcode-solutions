class Solution {
    public boolean isPalindrome(String s, int l, int r) {
        while (l < r) {

            if (s.charAt(l) != s.charAt(r)) return false;
            
            l++;
            r--;
        }

        return true;
    }

    public void backtrack(String s, int idx, List<String> curr, List<List<String>> res) {

        if (idx == s.length()) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = idx; i < s.length(); i++) {

            if (!isPalindrome(s, idx, i)) continue;
            
            curr.add(s.substring(idx, i + 1));

            backtrack(s, i + 1, curr, res);

            curr.remove(curr.size() - 1);
        }
    }

    public List<List<String>> partition(String s) {

        List<List<String>> res = new ArrayList<>();

        backtrack(s, 0, new ArrayList<>(), res);

        return res;
    }
}