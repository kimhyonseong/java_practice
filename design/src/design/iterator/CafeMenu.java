package design.iterator;

import java.util.HashMap;
import java.util.Map;

public class CafeMenu {
  Map<String, MenuItem> menuItems = new HashMap<>();

  public CafeMenu() {
    addItem("오늘의 스프", "샐러드 스프", false,3.99);
    addItem("오늘의 스프2", "양송이 스프", true,3.99);
    addItem("오늘의 스프2", "쇠고기 스프", false,3.99);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.put(name, menuItem);
  }

  public Map<String, MenuItem> getMenuItems() {
    return menuItems;
  }
}
