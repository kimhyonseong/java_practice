package scheduler;

import java.io.File;
import java.io.IOException;

public class Platform {
  public Platform() {
  }

  public void Naver() throws InterruptedException {
    System.out.println("Naver 시작... ");

    File file = new File("./src/scheduler/tmpFile/testNaver.txt");
    try {
      if (file.createNewFile()) {
        System.out.println("create file Naver.txt");
        throw new IOException("error");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    Thread.sleep(4000);
    System.out.println("Naver 끝 ");
  }

  public void Nate() throws InterruptedException {
    System.out.println("Nate 시작...");
    File file = new File("./src/scheduler/tmpFile/testNate.txt");
    try {
      if (file.createNewFile()) {
        System.out.println("create file Nate.txt");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("Nate 끝");
  }

  public void Daum() throws InterruptedException {
    System.out.println("Daum 시작...");
    File file = new File("./src/scheduler/tmpFile/testDaum.txt");
    try {
      if (file.createNewFile()) {
        System.out.println("create file Daum.txt");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    Thread.sleep(7000);
    System.out.println("Daum 끝... ");
  }

  public void Kakao() {
    System.out.println("Kakao 시작...");
    File file = new File("./src/scheduler/tmpFile/testKakao.txt");

    try {
      if (file.createNewFile()) {
        System.out.println("create file Kakao.txt");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Kakao 끝 ");

    throw new RuntimeException("tmp");
  }
}
