package design.adapter;

public class AirCon implements Elect220{
    @Override
    public void connect() {
        System.out.println("에어컨 220 on");
    }
}
