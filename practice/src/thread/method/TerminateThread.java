package thread.method;

import java.io.IOException;

public class TerminateThread extends Thread{
    private boolean flag = false;
    int i;

    public TerminateThread(String name) {
        super(name);
    }

    public void run() {
        while (!flag) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(getName() + " end");
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) throws IOException {
        TerminateThread thread1 = new TerminateThread("A");
        TerminateThread thread2 = new TerminateThread("B");
        TerminateThread thread3 = new TerminateThread("C");

        thread1.start();
        thread2.start();
        thread3.start();

        int in;

        while (true) {
            in = System.in.read();
            if (in == 'A') {
                thread1.setFlag(true);
            } else if (in == 'B') {
                thread2.setFlag(true);
            } else if (in == 'C') {
                thread3.setFlag(true);
            } else if (in == 'M') {
                thread1.setFlag(true);
                thread2.setFlag(true);
                thread3.setFlag(true);
                break;
            }
        }

        System.out.println("main end");
    }
}
