package Day4.Observer;

import Day4.Order;

public class AuditListener implements OrderListener {

    @Override
    public void update(Order order) {
        System.out.println("Order added to audit log: " + order.getItem());
    }
}