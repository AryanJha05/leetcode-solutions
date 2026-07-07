class Solution {
    public int countSegments(String s) {
        int cnt = 0;
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) cnt++;

            i++;
        }

        return cnt;
    }
}