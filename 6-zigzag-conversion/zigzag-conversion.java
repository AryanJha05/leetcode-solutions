class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        int n = s.length();

        char[][] res = new char[numRows][n];

        int row = 0;
        int col = 0;
        int i = 0;

        while (i < n) {

    
            while (i < n && row < numRows) res[row++][col] = s.charAt(i++);

            row = numRows - 2;

            while (i < n && row > 0) res[row--][++col] = s.charAt(i++);
            
            col++;
            row = 0;
        }

        StringBuilder ans = new StringBuilder();

        for (int r = 0; r < numRows; r++) for (int c = 0; c < n; c++) if (res[r][c] != '\0') ans.append(res[r][c]);

        return ans.toString();
    }
}