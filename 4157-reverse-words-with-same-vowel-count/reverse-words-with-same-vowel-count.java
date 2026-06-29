class Solution {

    public static int countVowel(String word) {

        int cnt = 0;

        for (char ch : word.toCharArray()) {
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u')
                cnt++;
        }

        return cnt;
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");

        int target = countVowel(words[0]);

        StringBuilder ans = new StringBuilder();
        ans.append(words[0]);
        if (words.length > 1) ans.append(" ");

        for (int i = 1; i < words.length; i++) {
            if (countVowel(words[i]) == target) {
                StringBuilder temp = new StringBuilder(words[i]);
                ans.append(temp.reverse());
            } else
                ans.append(words[i]);

            if (i != words.length - 1)
                ans.append(" ");
        }

        return ans.toString();
    }
}