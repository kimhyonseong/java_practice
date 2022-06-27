package interfaceTest.customer;

import interfaceTest.customer.Buy;
import interfaceTest.customer.Customer;
import interfaceTest.customer.Sell;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();
    }
}
