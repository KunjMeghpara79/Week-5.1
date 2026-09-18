package Day4.Chain;

import Day4.Order;

public class OrderAddressChecker implements OrderChecker{
    @Override
    public void handleCheck(Order order) {
        if(!order.getDeliveryAddress().contains("india")){
            System.out.println("invalid address");
            return;
        }
    }

    @Override
    public void setNextChecker(OrderChecker orderChecker) {

    }
}
