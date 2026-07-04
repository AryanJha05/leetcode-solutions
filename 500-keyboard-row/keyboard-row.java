class Solution {
    public String[] findWords(String[] words) {

        int len = words.length;

        ArrayList<String> res = new ArrayList<>();

        String[] keyBoard = {
            "qwertyuiop",
            "asdfghjkl",
            "zxcvbnm"
        };

        for (int i = 0; i < len; i++) {

            String word = words[i].toLowerCase();

            for (int row = 0; row < 3; row++) {

                boolean isValid = true;

                for (int j = 0; j < word.length(); j++) {

                    char ch = word.charAt(j);

                    if (keyBoard[row].indexOf(ch) == -1) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    res.add(words[i]);
                    break;
                }
            }
        }

        return res.toArray(new String[0]);
    }
}