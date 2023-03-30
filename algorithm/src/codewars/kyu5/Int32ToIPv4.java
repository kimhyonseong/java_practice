package codewars.kyu5;

public class Int32ToIPv4 {
  public static void main(String[] args) {
    Int32ToIPv4 iPv4 = new Int32ToIPv4();
    iPv4.test();
  }

  public String longToIP(long ip) {
    StringBuilder sb = new StringBuilder();
    StringBuilder binary = new StringBuilder(Long.toBinaryString(ip));
    String[] result = new String[]{"0","0","0","0"};
    int[] resultNum = new int[]{0,0,0,0};
    int resultCnt = 3;

    while(binary.length() < 32) {
      binary.insert(0, "0");
    }

    for (int i=binary.length()-1; i>=0; i--) {
      sb.append(binary.charAt(i));
      if (i%8 == 0) {
        // 10진수 변경
        resultNum[resultCnt] = Integer.parseInt(sb.reverse().toString(),2);
        sb.reverse();

        // 함수 만들어서 사용
        result[resultCnt] = binaryToDecimal(sb.reverse().toString());
        sb.setLength(0);
        resultCnt--;
      }
    }

    System.out.print("10진수 변경 답: ");
    for (int num : resultNum) {
      System.out.print(num+".");
    }
    System.out.print("\n함수 사용 답: ");
    System.out.println(String.join(".",result));
    System.out.printf("외국 답: %d.%d.%d.%d\n",ip>>>24,ip>>16&0xff,ip>>8&0xff,ip&0b11111111);
    return String.join(".",result);
  }

  public String binaryToDecimal(String binary) {
    int sum = 0;

    for(int i=0; i<binary.length(); i++) {
      if (binary.charAt(i) == '1') {
        sum += (int) Math.pow(2, binary.length()-1-i);
      }
    }
    return String.valueOf(sum);
  }

  public void test() {
    System.out.println("128.114.17.104".equals(longToIP(2154959208L)));
    System.out.println("0.0.0.0".equals(longToIP(0)));
    System.out.println("128.32.10.1".equals(longToIP(2149583361L)));
    System.out.println("83.120.135.1".equals(longToIP(1400407813L)));
  }
}
