package design.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
  ArrayList<MenuItem> menuItems;

  public PancakeHouseMenu() {
    menuItems = new ArrayList<>();

    addItem("K&B 팬케이크 세트","스크램블 에그와 토스트가 곁들여진 팬케이크", true, 2.99);
    addItem("K&B 팬케이크 세트2","스크램블 에그와 토스트가 곁들여진 팬케이크2", true, 2.99);
    addItem("K&B 팬케이크 세트3","스크램블 에그와 토스트가 곁들여진 팬케이크3", true, 3.49);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }

  /*
  public ArrayList<MenuItem> getMenuItem() {
    return menuItems;
  }
   */

  public Iterator<MenuItem> createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }
}
