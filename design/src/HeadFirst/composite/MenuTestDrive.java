package HeadFirst.composite;

public class MenuTestDrive {
  public static void main(String[] args) {
    MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스","아침 메뉴");
    MenuComponent dinerMenu = new Menu("저녁식당","점심 메뉴");
    MenuComponent cafeMenu = new Menu("카페","저녁 메뉴");
    MenuComponent desertMenu = new Menu("디저트 카페","디저트");

    MenuComponent allMenus = new Menu("전체메뉴", "전체 메뉴");

    allMenus.add(pancakeHouseMenu);
    allMenus.add(dinerMenu);
    allMenus.add(cafeMenu);

    dinerMenu.add(new MenuItem("파스타","채식 파스타", true, 3.99));
    dinerMenu.add(desertMenu);

    desertMenu.add(new MenuItem("애플파이","사과 파이", true, 1.99));

    Waitress waitress = new Waitress(allMenus);
    waitress.print();
  }
}