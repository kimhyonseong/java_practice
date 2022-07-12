package design.adapter;

public class HairDryer implements Elect110{
    @Override
    public void powerOn() {
        System.out.println("헤어드라이기 110 on");
    }
}
