package design.facade;

public class Writer {
    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        String msg = String.format("writer %s connect",fileName);
        System.out.println(msg);
    }

    public void fileDisconnect() {
        String msg = String.format("writer %s disconnect",fileName);
        System.out.println(msg);
    }

    public void write() {
        String msg = String.format("writer %s write",fileName);
        System.out.println(msg);
    }
}
