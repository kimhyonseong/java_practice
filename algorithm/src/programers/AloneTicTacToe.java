package programers;

import java.util.ArrayList;
import java.util.Arrays;

public class AloneTicTacToe {
  public static void main(String[] args) {
    AloneTicTacToe ticTacToe = new AloneTicTacToe();
    ticTacToe.test();
  }

  public int solution(String[] board) {
    ArrayList<String> resultList = new ArrayList<>();
    int oCnt = 0;
    int xCnt = 0;
    int answer = 1;

    char[][] boardChar = {
            board[0].toCharArray(),
            board[1].toCharArray(),
            board[2].toCharArray()
    };

    for (int i=0; i<3; i++) {
      resultList.add(board[i]);
      resultList.add(String.valueOf(boardChar[0][i]) + boardChar[1][i] + boardChar[2][i]);
    }

    resultList.add(String.valueOf(boardChar[0][0]) + boardChar[1][1] + boardChar[2][2]);
    resultList.add(String.valueOf(boardChar[0][2]) + boardChar[1][1] + boardChar[2][0]);

    for (char[] arr : boardChar) {
      for(char c : arr) {
        if (c == 'O') oCnt++;
        if (c == 'X') xCnt++;
      }
    }

    if ( oCnt < xCnt ||
            (resultList.contains("XXX") && resultList.contains("OOO")) ||
            (resultList.contains("OOO") && oCnt == xCnt) ||
            (resultList.contains("XXX") && oCnt > xCnt) ||
            Math.abs(oCnt - xCnt) > 1
    )
      answer = 0;

    System.out.println(resultList);
    return answer;
  }

  public void test() {
    System.out.println(solution(new String[]{"O.X", ".O.", "..X"}) == 1);
    System.out.println(solution(new String[]{"OOO", "...", "XXX"}) == 0);
    System.out.println(solution(new String[]{"...", ".X.", "..."}) == 0);
    System.out.println(solution(new String[]{"...", "...", "..."}) == 1);
    System.out.println(solution(new String[]{"O..", "...", "..."}) == 1);
    System.out.println(solution(new String[]{"O.X", "...", "..."}) == 1);
    System.out.println(solution(new String[]{"O.X", ".X.", "..."}) == 0);
    System.out.println(solution(new String[]{"O.X", ".OX", ".XO"}) == 0);
    System.out.println(solution(new String[]{".XX", "XOX", ".XO"}) == 0);
  }
}
