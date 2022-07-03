package thread;

//class MyThread extends Thread {
//    public void run() {
//        int i;
//        for (i=1; i<=200; i++) {
//            System.out.print(i+"\t");
//        }
//    }
//}

class MyThread implements Runnable {
    @Override
    public void run() {
        int i;
        for (i=1; i<=200; i++) {
            System.out.print(i+"\t");
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {

//        System.out.println(Thread.currentThread()+" start");
//        MyThread th1 = new MyThread();
//        MyThread th2 = new MyThread();
//
//        th1.start();
//        th2.start();
//        System.out.println(Thread.currentThread()+" end");

        System.out.println(Thread.currentThread()+" start");

        // 여러 쓰레드를 만들때
        MyThread runnable = new MyThread();
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);

        th1.start();
        th2.start();

        System.out.println(Thread.currentThread()+" end");

        // 간단하게 돌릴때
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };
        runnable1.run();
    }
}
