package codewars.kyu6;

public class BitCount {
  public static void main(String[] args) {
    BitCount bitCount = new BitCount();
    bitCount.countTest();
  }
  public int countBits(int n){
    int cnt = 0;
    String str = Integer.toBinaryString(n);

    for (char c : str.toCharArray()) {
      if (c == '1') {
        cnt++;
      }
    }
    /*
    new solution
    for(int i=n; i>0; i>>=1) {
      cnt += j & i;
    }
     */
    return cnt;
  }
  public void countTest() {
    BitCount bitCount = new BitCount();
    System.out.println(bitCount.countBits(1234)==5);
    System.out.println(bitCount.countBits(4)==1);
    System.out.println(bitCount.countBits(7)==3);
  }
}
