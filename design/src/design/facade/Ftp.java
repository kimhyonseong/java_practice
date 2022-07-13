package design.facade;

public class Ftp {
    private String host;
    private int port;
    private String path;

    public Ftp(String host, int port, String path) {
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public void connect() {
        System.out.println("ftp : "+host+" / port : "+port);
    }

    public void moveDirectory() {
        System.out.println("path : "+path);
    }

    public void disConnect() {
        System.out.println("disConnect");
    }
}
