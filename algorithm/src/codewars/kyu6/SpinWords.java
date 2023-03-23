package codewars.kyu6;

public class SpinWords {
  public static void main(String[] args) {
    SpinWords spinWords = new SpinWords();
    spinWords.spinWordsTest();
  }

  public String spinWords(String sentence) {
    StringBuilder sb = new StringBuilder();
    String[] parseStr = sentence.split(" ");

    for(String str : parseStr) {
      StringBuilder s = new StringBuilder(str);
      if(s.length() >= 5) {
        s.reverse();
      }
      sb.append(s).append(" ");
    }
    System.out.println("result: "+sb.toString().trim());
    return sb.toString().trim();
  }

  public void spinWordsTest() {
    boolean result1 = "emocleW".equals(new SpinWords().spinWords("Welcome"));
    System.out.printf("test1 %b\n", result1);

    boolean result2 = "Hey wollef sroirraw".equals(new SpinWords().spinWords("Hey fellow warriors"));
    System.out.printf("test2 %b\n",result2);
  }
}
