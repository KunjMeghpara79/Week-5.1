package Day4.Observer;

import Day4.Order;

public class EmailListener implements OrderListener {

    @Override
    public void update(Order order) {
        System.out.println("Email notification sent for order: " + order.getItem());
    }
}