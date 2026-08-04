class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkRow(board) && checkColumn(board) && checkGrid(board);
    }

    private boolean checkRow(char[][] board) {
        for (char[] row : board) {
            Set<Character> set = new HashSet<>();
            for (char c : row) {
                if (c != '.') {
                    if (set.contains(c))
                        return false;
                    set.add(c);
                }
            }
        }
        return true;
    }

    private boolean checkColumn(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (set.contains(board[j][i]))
                        return false;
                    set.add(board[j][i]);
                }
            }
        }
        return true;
    }

    private boolean checkGrid(char[][] board) {
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                Set<Character> set = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if (board[i][j] != '.') {
                            if (set.contains(board[i][j]))
                                return false;
                            set.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
