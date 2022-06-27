package interfaceTest.customer;

public interface Sell {
    void sell();

    default void order() {
        System.out.println("sell oder");
    }
}
