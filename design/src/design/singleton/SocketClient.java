package design.singleton;

public class SocketClient {
    //싱글톤 - 자기 자신 객체로 갖고 있어야함
    private static SocketClient socketClient = null;

    private SocketClient() {}

    public static SocketClient getInstance() {
        if (socketClient == null) {
            socketClient = new SocketClient();
        }

        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
