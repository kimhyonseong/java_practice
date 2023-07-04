package codewars.kyu5;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeDecomp {
  public static void main(String[] args) {
    test();
  }
  public static String factors(int n) {
//    ArrayList<Integer> arrayList = getPrimes(n);
//    String s = getString(arrayList,n);
    int i=2;
    StringBuilder sb = new StringBuilder();

    while(n != 1) {
      if (n % i == 0) {
        int cnt = 0;
        sb.append("(").append(i);

        while (n % i == 0) {
          cnt++;
          n /= i;
        }

        if (cnt>1) sb.append("**").append(cnt);
        sb.append(")");
      }
      i++;
    }

    return sb.toString();
  }

  public static String getString(ArrayList<Integer> arrayList,int n) {
    StringBuilder sb = new StringBuilder();

    for (Integer integer : arrayList) {
      if (n % integer == 0) {
        int cnt = 0;
        sb.append("(");
        sb.append(integer);

        while (n % integer == 0 && n != 1) {
          n = n / integer;
          cnt++;
        }

        if (cnt >= 2) {
          sb.append("**").append(cnt);
        }
        sb.append(")");
      }

      if (n == 1) break;
    }

    return sb.toString();
  }

  public static ArrayList<Integer> getPrimes(int num) {
    ArrayList<Integer> primeList = new ArrayList<>();
    boolean[] primes = new boolean[num+2];
    primes[0] = true;
    primes[1] = true;

    for (int i=2; i<=num+1; i++) {
      if (!primes[i]) {
        if (num % i ==0) {
          num /= i;
          primeList.add(i);
        }

        if (num == 1) break;

        for (int start = i + i; start <= num + 1; start += i) {
          primes[start] = true;
        }
      }
    }

    return primeList;
  }

  public static void test() {
    if ("(2**2)(3**3)(5)(7)(11**2)(17)".equals(PrimeDecomp.factors(7775460))) {
      System.out.println("pass");
    } else {
      System.out.println("fail");
    }

    if ("(7919)".equals(PrimeDecomp.factors(7919))) {
      System.out.println("pass");
    } else {
      System.out.println("fail");
    }

    if ("(3)(17**2)(31)(677)".equals(PrimeDecomp.factors(18195729))) {
      System.out.println("pass");
    } else {
      System.out.println("fail");
    }

    if ("(7537)(123863)".equals(PrimeDecomp.factors(933555431))) {
      System.out.println("pass");
    } else {
      System.out.println("fail");
    }
  }
}
