package design.adapter;

public class SocketAdapter implements Elect110{
    private Elect220 elect220;

    public SocketAdapter(Elect220 elect220) {
        this.elect220 = elect220;
    }
    @Override
    public void powerOn() {
        elect220.connect();
    }
}
