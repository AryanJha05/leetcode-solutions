class Solution {

    public String getLetters(char digit){
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

        return keys[digit - '0'];
    }

    public void backtrack(String digits, int idx, StringBuilder curr, List<String> res){

        if(idx == digits.length()){
            res.add(curr.toString());
            return;
        }

        String letters = getLetters(digits.charAt(idx));

        for(int i = 0; i < letters.length(); i++){

            curr.append(letters.charAt(i));

            backtrack(digits, idx + 1, curr, res);

            curr.deleteCharAt(curr.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();

        if(digits.length() == 0) return res;

        backtrack(digits, 0, new StringBuilder(), res);

        return res;      

    }
}