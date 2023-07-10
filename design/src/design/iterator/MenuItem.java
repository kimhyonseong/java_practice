package design.iterator;

public class MenuItem {
  public MenuItem(String name, String description, boolean vegetarian, double price) {
    this.name = name;
    this.description = description;
    this.vegetarian = vegetarian;
    this.price = price;
  }

  private String name;
  private String description;
  private boolean vegetarian;
  private double price;
}
