package design.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
  static final int MAX_ITEMS = 6;
  int numberOfItems = 0;
  MenuItem[] menuItems;

  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];

    addItem("채식주의자용","통밀", true, 2.99);
    addItem("육식주의자용","고기", false, 3.99);
    addItem("채식주의자용2","통밀2", true, 3.99);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    if (numberOfItems >= MAX_ITEMS) {
      System.out.println("꽉 찼습니다.");
    } else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems++;
    }
  }

  /*
  public MenuItem[] getMenuItems() {
    return menuItems;
  }
   */

  public Iterator<MenuItem> createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}
