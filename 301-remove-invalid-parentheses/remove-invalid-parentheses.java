class Solution {

    int maxLen = 0;

    public void solve(int i, int cnt, StringBuilder curr, String s, HashSet<String> set){

        if(i == s.length()){
            if(cnt == 0){
                if(curr.length() > maxLen){
                    maxLen = curr.length();
                    set.clear();
                }

                if(curr.length() == maxLen) set.add(curr.toString());
            }

            return;
        }

        char ch = s.charAt(i);

        if(ch != '(' && ch != ')'){
            curr.append(ch);
            solve(i + 1, cnt, curr, s, set);
            curr.deleteCharAt(curr.length() - 1);
            return;
        }

        if(ch == '(' || cnt > 0) {
            curr.append(ch);

            solve(i + 1, cnt + (ch == '(' ? 1 : -1), curr, s, set);

            curr.deleteCharAt(curr.length() - 1);
        }

        solve(i + 1, cnt, curr, s, set);
    }

    public List<String> removeInvalidParentheses(String s) {

        HashSet<String> set = new HashSet<>();

        maxLen = 0;

        solve(0, 0, new StringBuilder(), s, set);

        return new ArrayList<>(set);
    }
}