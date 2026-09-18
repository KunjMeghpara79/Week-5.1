package Day4.Strategy;

import Day4.Order;

public class VipDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscont(Order order) {
        return order.getAmount() - (order.getAmount()*0.3);
    }
}
