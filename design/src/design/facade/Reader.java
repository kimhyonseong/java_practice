package design.facade;

public class Reader {
    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        String msg = String.format("reader %s connect",fileName);
        System.out.println(msg);
    }

    public void fileReader() {
        String msg = String.format("read %s",fileName);
        System.out.println(msg);
    }

    public void fileDisconnect() {
        System.out.println("연결 종료");
    }
}
