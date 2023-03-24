package codewars.kyu5;

public class TrailingNumber {
  public static void main(String[] args) {
    TrailingNumber number = new TrailingNumber();
    number.zeroTest();
    // 타임아웃...
  }

  public int countNum(int base, int num) {
    int result = 0;

    while(base%num == 0) {
      base /= num;
      result++;
    }

    return result;
  }

  public int zeros(int n) {
    //int two = 0;
    int five = 0;

    for(int i=5; i<=n; i+=5) {
      int num = i;
      while(num%5 == 0) {
        num /= 5;
        five++;
      }
    }

    return five;
  }

  public void zeroTest() {
    TrailingNumber number = new TrailingNumber();

    System.out.println(number.zeros(0));
    number.zeros(4);
    number.zeros(5);
    number.zeros(6);
    number.zeros(14);
    number.zeros(15);
    number.zeros(16);
    number.zeros(17);
    number.zeros(18);
    number.zeros(19);
    number.zeros(20);
    number.zeros(21);
    number.zeros(22);
    number.zeros(23);
    number.zeros(24);
    number.zeros(25);
    number.zeros(30);
  }
}
