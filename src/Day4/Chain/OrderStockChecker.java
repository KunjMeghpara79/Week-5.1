package Day4.Chain;

import Day4.Order;

public class OrderStockChecker implements OrderChecker{
    private Stock stock;
    private OrderChecker nextChecker;
    public OrderStockChecker(Stock stock){
        this.stock = stock;
    }
    @Override
    public void handleCheck(Order order) {
        if(!this.stock.getOrderList().contains(order.getItem())){
            System.out.println("The item is not available !");
            return;
        }
        else if(this.nextChecker != null) {
            nextChecker.handleCheck(order);
        }
    }

    @Override
    public void setNextChecker(OrderChecker orderChecker) {
        this.nextChecker = orderChecker;
    }
}
