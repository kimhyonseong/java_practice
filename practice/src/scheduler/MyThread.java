package scheduler;

import java.util.logging.Logger;

public class MyThread implements Runnable{
  boolean result;
  private final static Logger LOG = Logger.getGlobal();
  StringBuilder sb1 = new StringBuilder();
  private int num = 0;

  public MyThread(){}
  public MyThread(int i) {
    this.num = i;
  }
  public MyThread(boolean result,int i) {
    this.result = result;
    this.num = i;
  }

  @Override
  public void run() {
    try {
      try {
        Platform platform = new Platform();
        switch (num) {
          case 1 -> platform.Naver();
          case 2 -> platform.Nate();
          case 3 -> platform.Kakao();
          case 4 -> platform.Daum();
        }
      } catch (Throwable e) {
        System.out.println("에러");
      }
      this.result = true;
    } catch (RuntimeException e) {
      LOG.info("thread error");
    }
  }


}
