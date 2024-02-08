package jv;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
              if (board[r][c] == word.charAt(0)) {
                if (dfs(board, word, r, c, 0)) {
                  return true;
                }
              }
            }
          }
          return false;

    }
    public boolean dfs(char[][] board, String word, int x, int y, int start) {
        if (start == word.length()) {
            return true;
        }

        if (!(x >= 0 && x < board.length && y >= 0 && y < board[0].length)) {
            return false;
        } 

        if (board[x][y] != word.charAt(start)) {
            return false;
        }
        board[x][y] = '/';

        boolean result = dfs(board,word, x + 1, y, start + 1)
            || dfs(board,word, x, y + 1, start + 1)
            || dfs(board,word, x - 1, y, start + 1)
            || dfs(board,word, x, y - 1, start + 1);

        board[x][y] = word.charAt(start);

        return result; // true or false
    }
}
