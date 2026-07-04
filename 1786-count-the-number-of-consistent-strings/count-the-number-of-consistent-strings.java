class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        boolean[] arr = new boolean[26];

        // Mark allowed characters
        for (int i = 0; i < allowed.length(); i++) arr[allowed.charAt(i) - 'a'] = true;

        int count = 0;

        for (String word : words) {

            boolean isValid = true;

            for (int i = 0; i < word.length(); i++) {

                if (!arr[word.charAt(i) - 'a']) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) count++;
        }

        return count;
    }
}