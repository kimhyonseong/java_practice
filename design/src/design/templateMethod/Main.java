package design.templateMethod;

import design.templateMethod.basic.Tea;
import design.templateMethod.withHook.CoffeeWithHook;
import design.templateMethod.withHook.TeaWithHook;

public class Main {
  public static void main(String[] args) {
    Tea myTea = new Tea();
    System.out.println("홍차 준비중...");
    myTea.prepareRecipe();

    CoffeeWithHook coffee = new CoffeeWithHook();
    System.out.println("\n커피 준비중...");
    coffee.prepareRecipe();

    TeaWithHook teaWithHook = new TeaWithHook();
    System.out.println("\n홍차 준비중...");
    teaWithHook.prepareRecipe();
  }
}
