package design.singleton;

import design.singleton.AClazz;
import design.singleton.BClazz;
import design.singleton.SocketClient;

public class Main {
    public static void main(String[] args) {
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aSocket = aClazz.getSocketClient();
        SocketClient bSocket = bClazz.getSocketClient();

        System.out.println(aSocket.equals(bSocket));
    }
}
