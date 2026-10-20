class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character>[] row = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] box = new HashSet[9];

        for(int i = 0; i < 9; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){

                char c = board[i][j];

                if(c == '.') continue;

                int b = (i / 3)*3 + (j / 3);

                if (!row[i].add(c) || !col[j].add(c) || !box[b].add(c)) return false;

            }
        }

        return true;
    }
}