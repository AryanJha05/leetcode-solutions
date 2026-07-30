class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();

        if (digits.length() == 0)
            return res;

        String[] keys = {
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

        if (digits.length() == 1) {
            int a = digits.charAt(0) - '0';

            for (int i = 0; i < keys[a].length(); i++) {
                res.add("" + keys[a].charAt(i));
            }
        }

        else if (digits.length() == 2) {
            int a = digits.charAt(0) - '0';
            int b = digits.charAt(1) - '0';

            for (int i = 0; i < keys[a].length(); i++) {
                for (int j = 0; j < keys[b].length(); j++) {

                    res.add("" + keys[a].charAt(i)
                            + keys[b].charAt(j));
                }
            }
        }

        else if (digits.length() == 3) {
            int a = digits.charAt(0) - '0';
            int b = digits.charAt(1) - '0';
            int c = digits.charAt(2) - '0';

            for (int i = 0; i < keys[a].length(); i++) {
                for (int j = 0; j < keys[b].length(); j++) {
                    for (int k = 0; k < keys[c].length(); k++) {

                        res.add("" + keys[a].charAt(i)
                                + keys[b].charAt(j)
                                + keys[c].charAt(k));
                    }
                }
            }
        }

        else if (digits.length() == 4) {
            int a = digits.charAt(0) - '0';
            int b = digits.charAt(1) - '0';
            int c = digits.charAt(2) - '0';
            int d = digits.charAt(3) - '0';

            for (int i = 0; i < keys[a].length(); i++) {
                for (int j = 0; j < keys[b].length(); j++) {
                    for (int k = 0; k < keys[c].length(); k++) {
                        for (int l = 0; l < keys[d].length(); l++) {

                            res.add("" + keys[a].charAt(i)
                                    + keys[b].charAt(j)
                                    + keys[c].charAt(k)
                                    + keys[d].charAt(l));
                        }
                    }
                }
            }
        }

        return res;
    }
}