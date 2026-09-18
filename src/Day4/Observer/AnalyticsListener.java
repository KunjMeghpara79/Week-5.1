package Day4.Observer;

import Day4.Order;

public class AnalyticsListener implements OrderListener {

    @Override
    public void update(Order order) {
        System.out.println("Order data sent to analytics system: " + order.getItem());
    }
}