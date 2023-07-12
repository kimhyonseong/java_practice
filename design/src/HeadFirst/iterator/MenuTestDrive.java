package HeadFirst.iterator;

import java.util.ArrayList;
import java.util.List;

public class MenuTestDrive {
  public static void main(String[] args) {
    List<Menu> menus = new ArrayList<>();
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();

    menus.add(pancakeHouseMenu);
    menus.add(dinerMenu);
    menus.add(cafeMenu);

    Waitress waitress = new Waitress(menus);
    waitress.printMenu();
  }
}
