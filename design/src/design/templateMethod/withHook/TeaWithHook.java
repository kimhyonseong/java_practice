package design.templateMethod.withHook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook{
  @Override
  public void brew() {
    System.out.println("찻잎을 우려내는 중");
  }

  @Override
  public void addCondiments() {
    System.out.println("레몬을 추가하는 중");
  }

  boolean customerWantsCondiments() {
    String answer = getUserInput();

    return answer.toLowerCase().startsWith("y");
  }

  private String getUserInput() {
    String answer = "";

    System.out.println("차에 레몬을 넣을까요? (y/n)? ");

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    try {
      answer = in.readLine();
    } catch (IOException ioe) {
      System.err.println("IO 오류");
    }

    return answer.equals("") ? "no" : answer;
  }
}
