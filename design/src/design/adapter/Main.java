package design.adapter;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        HairDryer hairDryer = new HairDryer();
        main.connect(hairDryer);

        // A -> B로 바꾸기 위해 어댑터 추가
        AirCon airCon = new AirCon();
        Elect110 socketAdapter = new SocketAdapter(airCon);
        main.connect(socketAdapter);
    }

    public void connect(Elect110 elect110) {
        elect110.powerOn();
    }
}
