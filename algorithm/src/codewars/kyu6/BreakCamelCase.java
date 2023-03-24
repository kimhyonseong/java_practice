package codewars.kyu6;

public class BreakCamelCase {
  public static void main(String[] args) {
    BreakCamelCase camelCase = new BreakCamelCase();
    camelCase.solutionTest();
  }

  public String solution(String str) {
    StringBuilder sb = new StringBuilder();

    for (char c : str.toCharArray()) {
      if (Character.isUpperCase(c)) {
        sb.append(" ");
      }
      sb.append(c);
    }
    return sb.toString();
  }

  public void solutionTest() {
    System.out.println(solution("caMel").equals("ca Mel"));
    System.out.println(solution("appleIsBig").equals("apple Is Big"));
  }
}
