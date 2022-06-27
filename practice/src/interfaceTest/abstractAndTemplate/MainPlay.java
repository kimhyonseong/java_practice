package interfaceTest.abstractAndTemplate;

public class MainPlay {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        AdvancedLevel al = new AdvancedLevel();
        player.upgradeLevel(al);
        player.play(2);

        SuperLevel sl = new SuperLevel();
        player.upgradeLevel(sl);
        player.play(3);
    }
}

