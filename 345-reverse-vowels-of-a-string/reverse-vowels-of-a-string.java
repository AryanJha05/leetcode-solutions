class Solution {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public String reverseVowels(String s) {

        int n = s.length();

        int l = 0, r = n - 1;

        StringBuilder sb = new StringBuilder(s);

        while (l < r) {

            // Set R pointer
            while (l < r && !isVowel(sb.charAt(r))) r--;

            // Set L pointer
            while (l < r && !isVowel(sb.charAt(l))) l++;

            // Swap
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);

            // Move pointers
            l++;
            r--;
        }

        return sb.toString();
    }
}