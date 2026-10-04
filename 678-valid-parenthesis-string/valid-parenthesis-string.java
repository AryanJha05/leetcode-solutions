class Solution {

    Boolean[][] dp;
    public boolean solve(String s, int idx, int open){

        if(open < 0) return false;

        if(idx == s.length()) return open == 0;

        if (dp[idx][open] != null) return dp[idx][open];

        char ch = s.charAt(idx);

        if(ch == '(') return dp[idx][open] = solve(s, idx + 1, open + 1);

        if(ch == ')') return dp[idx][open] = solve(s, idx + 1, open - 1);

        return dp[idx][open] = solve(s, idx + 1, open + 1) || solve(s, idx + 1, open - 1) || solve(s, idx + 1, open);
    }

    public boolean checkValidString(String s) {

        dp = new Boolean[s.length()][s.length() + 1];
        return solve(s, 0, 0);      
    }
}