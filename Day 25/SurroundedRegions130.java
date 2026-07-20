public class SurroundedRegions130 {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;
        int rows = board.length, cols = board[0].length;
        for (int i = 0; i < rows; i++) {
            markSafe(board, i, 0);
            markSafe(board, i, cols - 1);
        }
        for (int j = 0; j < cols; j++) {
            markSafe(board, 0, j);
            markSafe(board, rows - 1, j);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void markSafe(char[][] board, int i, int j) {
        int rows = board.length, cols = board[0].length;
        if (i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] != 'O') return;
        board[i][j] = '#';
        markSafe(board, i + 1, j);
        markSafe(board, i - 1, j);
        markSafe(board, i, j + 1);
        markSafe(board, i, j - 1);
    }
}
