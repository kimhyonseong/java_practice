package socket;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class Server extends Thread{

  private static final Logger LOGGER = Logger.getLogger("Server");

  private Socket socket;

  public Server() {}
  public Server(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    try (OutputStream outStream = this.socket.getOutputStream();
         DataOutputStream dataOutputStream = new DataOutputStream(outStream);

         InputStream inputStream = this.socket.getInputStream();
         DataInputStream dataInputStream = new DataInputStream(inputStream)) {
      while (true) {
        int receiveLen = dataInputStream.readInt();
        byte[] receiveByte = new byte[receiveLen];
        dataInputStream.readFully(receiveByte, 0,receiveLen);
        String receiveMessage = new String(receiveByte);

        System.out.println("receive Message : "+receiveMessage);
        System.out.println("data receive success");

        String sendMessage = "서버에 보낼 데이터";
        byte[] sendByte = sendMessage.getBytes(StandardCharsets.UTF_8);
        int sendLen = sendByte.length;
        dataOutputStream.writeInt(sendLen);
        dataOutputStream.write(sendByte,0,sendLen);

        System.out.println("send Message : "+sendMessage);
        System.out.println("data send success");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
