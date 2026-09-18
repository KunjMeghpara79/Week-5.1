package Day4;

import Day2.Order;

public class StockChecker implements OrderChecker{
    private OrderChecker nextChecker;
    private Stock stock;
    public StockChecker(Stock stock){
        this.stock = stock;
    }
    @Override
    public void setNextChecker(OrderChecker orderChecker) {
        this.nextChecker = orderChecker;
    }

    @Override
    public void handleCheck(Order order) {
        if(stock.getOrderList().contains(order.getItem())){
            System.out.println("This item is available in stock.");
            return;
        }else if(this.nextChecker != null){
            nextChecker.handleCheck(order);
        }
    }
}
