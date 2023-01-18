package socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
  private static final int tcpPort = 9999;

  public TcpServer() {
    try {
      ServerSocket serverSocket = new ServerSocket();
      serverSocket.bind(new InetSocketAddress(tcpPort));

      System.out.println("start tcp server: "+tcpPort);

      while (true) {
        Socket socket = serverSocket.accept();
        System.out.println("connected "+socket.getLocalPort()+" Port, From "+socket.getRemoteSocketAddress().toString());

        Server tcpServer = new Server(socket);
        tcpServer.start();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
