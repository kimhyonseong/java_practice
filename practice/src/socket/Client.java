package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
  public static void main(String[] args) {

    try {
      Socket socket = new Socket("localhost",9999);
      //socket.connect(new InetSocketAddress("localhost",9999));
      System.out.println("Connect to server: "+socket);

      OutputStream os = socket.getOutputStream();
      DataOutputStream dos = new DataOutputStream(os);

      String str = "클라이언트에서 보내는 메시지";
      byte[] bytes = str.getBytes(StandardCharsets.UTF_8);

      dos.writeInt(bytes.length);
      dos.write(bytes,0, bytes.length);
      dos.flush();

      System.out.println("send success : "+str);

      InputStream is = socket.getInputStream();
      DataInputStream dis = new DataInputStream(is);

      int receiveLen = dis.readInt();
      System.out.println("receiveLen : "+receiveLen);

      if (receiveLen > 0) {
        byte[] receiveByte = new byte[receiveLen];
        dis.readFully(receiveByte,0,receiveLen);

        String message = new String(receiveByte);
        System.out.println("받은 데이터  : "+message);
      }

      os.close();
      is.close();

      socket.close();
      System.out.println("socket close");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
