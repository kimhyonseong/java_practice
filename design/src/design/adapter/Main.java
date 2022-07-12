package design.adapter;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        HairDryer hairDryer = new HairDryer();
        main.connect(hairDryer);

        AirCon airCon = new AirCon();
        Elect110 socketAdapter = new SocketAdapter(airCon);
        main.connect(socketAdapter);
    }

    public void connect(Elect110 elect110) {
        elect110.powerOn();
    }
}
