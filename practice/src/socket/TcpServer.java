package socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
  private static final int tcpPort = 9999;

  public TcpServer() {
    new TcpServer(tcpPort);
  }
  public TcpServer(int portNo) {
    try {
      ServerSocket serverSocket = new ServerSocket(tcpPort);
      // 위의 생성자에서 포트를 넣으면 바인드하는 것과 동일
      //serverSocket.bind(new InetSocketAddress(tcpPort));

      System.out.println("start tcp server: "+tcpPort);

      while (true) {
        Socket socket = serverSocket.accept();
        System.out.println("connected "+socket.getLocalPort()+" Port, From "+socket.getRemoteSocketAddress().toString());

        Server tcpServer = new Server(socket);
        // thread 클래스는 start() 메서드 실행 시 run() 메서드 수행
        tcpServer.start();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
