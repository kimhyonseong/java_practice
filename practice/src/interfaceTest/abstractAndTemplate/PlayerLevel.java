package interfaceTest.abstractAndTemplate;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();

    public void go(int num) {
        run();

        for (int i=0; i<num; i++) {
            jump();
        }

        turn();
    }
}
