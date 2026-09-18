package Day4.Chain;

import Day4.Order;

public class OrderFraudChecker implements OrderChecker{
    private OrderChecker nextChecker;
    @Override
    public void handleCheck(Order order) {
        if(order.getDeliveryNotes().toLowerCase().equals("fraud")){
            System.out.println("This order is fraud");
            return;
        }
        else if(this.nextChecker != null){
            nextChecker.handleCheck(order);
        }
    }

    @Override
    public void setNextChecker(OrderChecker orderChecker) {
        this.nextChecker = orderChecker;
    }
}
