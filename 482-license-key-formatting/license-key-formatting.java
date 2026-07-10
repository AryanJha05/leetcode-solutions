class Solution {
    public String licenseKeyFormatting(String s, int k) {

        StringBuilder res = new StringBuilder();

        int cnt = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if (ch == '-') continue;

            if (cnt == k) {
                res.append('-');
                cnt = 0;
            }

            res.append(Character.toUpperCase(ch));
            cnt++;
        }

        return res.reverse().toString();
    }
}