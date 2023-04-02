package codewars.kyu5;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.stream.IntStream.of;

public class TicTacToeChecker {
  public static void main(String[] args) {

    System.out.println(isSolved(new int[][]{
            {1, 0, 2},
            {2, 1, 2},
            {0, 1, 1}
    }) == 1);

    System.out.println(isSolved(new int[][]{
            {1, 2, 2},
            {2, 1, 0},
            {1, 2, 1}
    }) == 1);
  }

  public static int isSolved(int[][] board) {
    boolean zero = false;
    int lCol = 0;
    int rCol = board.length-1;
    int left = board[0][lCol];
    int right = board[0][rCol];
    int[] row = new int[board.length];
    int[] col = new int[board.length];
    ArrayList<Integer> arrayList = new ArrayList<>();
    col = Arrays.copyOf(board[0],board[0].length);

    for (int i=0; i<board.length; i++) {
      row[i] = board[i][0];

      for (int j=0; j<board[i].length; j++) {
        // 0 check
        if (board[i][j] == 0) zero = true;

        // row check
        if (row[i] != board[i][j])
          row[i] = 0;

        // column check
        if (col[j] != board[i][j])
          col[j] = 0;
      }

      // diagonal check
      if (left != board[i][lCol]) left = 0;
      if (right != board[i][rCol]) right = 0;
      lCol++;
      rCol--;
    }
    arrayList.add(left);
    arrayList.add(right);
    for (int num : col)
      arrayList.add(num);
    for (int num : row)
      arrayList.add(num);

    if (arrayList.contains(1) || arrayList.contains(2)) {
      if (arrayList.contains(1) && arrayList.contains(2))
        return 0;
      else if (arrayList.contains(1)) {
        return 1;
      } else {
        return 2;
      }
    } else {
      if (zero)
        return -1;
      return 0;
    }
  }

  // 다른 사람이 푼것
  static int isSolvedAnother(int[][] board) {
    var stats = of(
            board[0][0] * board[0][1] * board[0][2],
            board[1][0] * board[1][1] * board[1][2],
            board[2][0] * board[2][1] * board[2][2], // 가로
            board[0][0] * board[1][0] * board[2][0],
            board[0][1] * board[1][1] * board[2][1],
            board[0][2] * board[1][2] * board[2][2], //세로
            board[0][0] * board[1][1] * board[2][2],
            board[0][2] * board[1][1] * board[2][0]
    ).map(i -> i == 8 ? 2 : i == 1 ? 1 : i > 0 ? 0 : -2).summaryStatistics();
    return stats.getSum() == 0 ? 0 : stats.getMax() > 0 ? stats.getMax() : -1;
  }
}
