package thread.sync;

import java.util.ArrayList;

class FastLibrary {
    public ArrayList<String> shelf = new ArrayList<>();

    public FastLibrary() {
        shelf.add("태백산맥1");
        shelf.add("태백산맥2");
        shelf.add("태백산맥3");
//        shelf.add("태백산맥4");
//        shelf.add("태백산맥5");
//        shelf.add("태백산맥6");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();

        while (shelf.size() == 0) {
            System.out.println(t.getName()+" waiting start");
            wait();
            System.out.println(t.getName()+" waiting end");
        }

        if (shelf.size() > 0) {
            String book = shelf.remove(0);
            System.out.println(t.getName() + ": " + book + " lend");
            return book;
        } else {
            return null;
        }
    }

    public synchronized void returnBook(String book) {
        Thread t = Thread.currentThread();

        shelf.add(book);
        notifyAll();
        System.out.println(t.getName()+": "+book+" return");
    }
}

class Student extends Thread{
    public Student() {}
    public Student(String name) {
        super(name);
    }
    public void run() {

        try {
            String title = LibraryMain.library.lendBook();
            if (title == null) {
                System.out.println("빌리지 못함");
                return;
            }
            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class LibraryMain {
    public static FastLibrary library = new FastLibrary();

    public static void main(String[] args) {
        Student s1 = new Student("st1");
        Student s2 = new Student("st2");
        Student s3 = new Student("st3");
        Student s4 = new Student("st4");
        Student s5 = new Student("st5");
        Student s6 = new Student("st6");

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
        s6.start();
    }
}
