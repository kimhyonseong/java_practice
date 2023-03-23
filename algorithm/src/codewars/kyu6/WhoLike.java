package codewars.kyu6;

public class WhoLike {
  public static void main(String[] args) {
    WhoLike.staticTests();
  }
  public static String whoLikesIt(String... names) {
    //Do your magic here
    StringBuilder sb = new StringBuilder();

    if(names.length <= 0)
      return "no one likes this";

    sb.append(names[0]);
    if (names.length > 1) {
      switch (names.length) {
        case 2 -> sb.append(" and ").append(names[1]);
        case 3 -> sb.append(", ").append(names[1]).append(" and ").append(names[2]);
        default -> sb.append(", ").append(names[1]).append(" and ").append(names.length - 2).append(" others");
      }
      sb.append(" like this");
    } else {
      sb.append(" likes this");
    }

    return sb.toString();
  }

  public static void staticTests() {
    if("no one likes this".equals(WhoLike.whoLikesIt()))
      System.out.println("test1 success");
    if("Peter likes this".equals(WhoLike.whoLikesIt("Peter")))
      System.out.println("test2 success");
    if("Jacob and Alex like this".equals(WhoLike.whoLikesIt("Jacob", "Alex")))
      System.out.println("test3 success");
    else
      System.out.println(WhoLike.whoLikesIt("Jacob", "Alex"));
    if("Max, John and Mark like this".equals(WhoLike.whoLikesIt("Max", "John", "Mark")))
      System.out.println("test4 success");
    else
      System.out.println(WhoLike.whoLikesIt("Max", "John", "Mark"));
    if("Alex, Jacob and 2 others like this".equals(WhoLike.whoLikesIt("Alex", "Jacob", "Mark", "Max")))
      System.out.println("test5 success");
  }
}