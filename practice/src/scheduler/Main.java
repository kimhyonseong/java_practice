package scheduler;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
  public static void main(String[] args) {
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
      @Override
      public void run() {
        try {
          CompletableFuture.runAsync(() -> {
            System.out.println("시작--------------------------------");
            //CompletableFuture<Integer> future = new CompletableFuture<>();
            //ExecutorService executorService = Executors.newFixedThreadPool(10);
            ExecutorService executorService = Executors.newCachedThreadPool();

            for (int i = 1; i < 5; i++) {
              executorService.submit(new MyThread(i));
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }

            executorService.shutdown();

            while (!executorService.isTerminated());

            if(executorService.isShutdown()) {
              System.out.println("끝--------------------------------");
            }
          });

        } catch (Throwable e) {
          e.printStackTrace();
        }
      }
    };

    //timer.schedule(task,0,3000);
    timer.scheduleAtFixedRate(task,0,3000);
  }
}
