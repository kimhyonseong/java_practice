package design.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu{
  Map<String, MenuItem> menuItems = new HashMap<>();

  public CafeMenu() {
    addItem("오늘의 스프", "샐러드 스프", false,1.99);
    addItem("오늘의 스프2", "양송이 스프", true,2.99);
    addItem("오늘의 스프3", "쇠고기 스프", false,3.99);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.put(name, menuItem);
  }

  @Override
  public Iterator<MenuItem> createIterator() {
    return menuItems.values().iterator();
  }
}
