class Solution {
    public boolean isSubstring(String word, String pattern) {

        for (int i = 0; i <= word.length() - pattern.length(); i++) {
            int j = 0;

            while (j < pattern.length() && word.charAt(i + j) == pattern.charAt(j)) j++;

            if(j == pattern.length()) return true;
        }

        return false;
    }

    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        // for(String pattern : patterns) if(word.contains(pattern)) count++;

        for (String pattern : patterns) if (word.indexOf(pattern) != -1) count++;

        //for (String pattern : patterns) if (isSubstring(word, pattern)) count++;


        // for (String pattern : patterns) {
        //     for (int i = 0; i <= word.length() - pattern.length(); i++) {
        //         if (word.startsWith(pattern, i)) {
        //             count++;
        //             break;
        //         }
        //     }
        // }


        return count;
    }
}
