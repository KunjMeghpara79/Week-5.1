package Day4;

import Day2.Order;

public class DiscountChecker implements OrderChecker{

    @Override
    public void setNextChecker(OrderChecker orderChecker) {

    }

    @Override
    public void handleCheck(Order order) {
        if(order.getDiscountCode() == null){
            System.out.println("No discount applied !");
        }else{
            System.out.println("Discount applied !");
        }
    }
}
