package HeadFirst.iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
  List<Menu> menus;

  public Waitress(List<Menu> menus) {
    this.menus = menus;
  }

  public void printMenu() {
    for (Menu menu : menus) {
      printMenu(menu.createIterator());
    }
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
