package design.iterator;

import java.util.Iterator;

public class Waitress {
  PancakeHouseMenu pancakeHouseMenu;
  DinerMenu dinerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

    System.out.println("메뉴\n---\n아침메뉴");
    printMenu(pancakeIterator);
    System.out.println("\n점심 메뉴");
    printMenu(dinerIterator);
  }

  private void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      System.out.println(menuItem.getName()+", ");
      System.out.println(menuItem.getPrice()+"-- ");
      System.out.println(menuItem.getDescription());
    }
  }
}
