package design.templateMethod.withHook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
  @Override
  public void brew() {
    System.out.println("필터로 커피를 우려내는 중");
  }

  @Override
  public void addCondiments() {
    System.out.println("설탕과 우유를 추가하는 중");
  }

  public boolean customerWantsCondiments() {
    String answer = getUserInput();

    return answer.toLowerCase().startsWith("y");
  }

  private String getUserInput() {
    String answer = "";

    System.out.println("커피에 우유와 설탕을 넣을까요? (y/n)? ");

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    try{
      answer = in.readLine();
    } catch (IOException ioe) {
      System.err.println("IO 오류");
    }

    if (answer.equals("")) {
      return "no";
    }
    return answer;
  }
}
