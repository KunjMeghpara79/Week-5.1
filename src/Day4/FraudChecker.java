package Day4;

import Day2.Order;

public class FraudChecker implements OrderChecker{
    private OrderChecker nextChecker;
    @Override
    public void setNextChecker(OrderChecker orderChecker) {
        this.nextChecker = orderChecker;
    }

    @Override
    public void handleCheck(Order order) {
        if(order.getDeliveryNotes().toLowerCase() == "fraud"){
            System.out.println("This order is fraud !");
            return;
        }
        else if (this.nextChecker != null){
            nextChecker.handleCheck(order);
        }
    }
}
